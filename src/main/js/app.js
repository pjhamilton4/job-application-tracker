'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {
	    constructor(props){
		super(props);
		this.state = {jobs: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/jobs'}).done(response => {
			this.setState({jobs: response.entity._embedded.jobs});
		});
	}

	render() {
		return (
			<JobList jobs={this.state.jobs}/>
		)
	}
}

class JobList extends React.Component{
	render() {
		const jobs = this.props.jobs.map(job =>
			<Job key={job._links.self.href} job={job}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Company</th>
						<th>Title</th>
						<th>Description</th>
					</tr>
					{jobs}
				</tbody>
			</table>
		)
	}
}

class Job extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.job.company}</td>
				<td>{this.props.job.title}</td>
				<td>{this.props.job.description}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)