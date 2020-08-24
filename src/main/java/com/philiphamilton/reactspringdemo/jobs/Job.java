package com.philiphamilton.reactspringdemo.jobs;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;

@Entity
@Builder
public class Job {
	
	private @Id @GeneratedValue Long id;
	private String company;
	private boolean applied;
	private String title;
	private String description;
	private Date dateApplied;
	private boolean interview;
	private Date interviewDate;
	private String contactAtCompany;
	private String linkToJob;
	private ArrayList<String> technologies;
	
	public Job() {}
	
	public Job(String company, boolean applied, String title, String description, Date dateApplied, boolean interview,
			Date interviewDate, String contactAtCompany, String linkToJob, ArrayList<String> technologies) {
		super();
		this.company = company;
		this.applied = applied;
		this.title = title;
		this.description = description;
		this.dateApplied = dateApplied;
		this.interview = interview;
		this.interviewDate = interviewDate;
		this.contactAtCompany = contactAtCompany;
		this.linkToJob = linkToJob;
		this.technologies = technologies;
	}

	public Job(Long id, String company, boolean applied, String title, String description, Date dateApplied, boolean interview, Date interviewDate, String contactAtCompany, String linkToJob, ArrayList<String> technologies) {
		this.id = id;
		this.company = company;
		this.applied = applied;
		this.title = title;
		this.description = description;
		this.dateApplied = dateApplied;
		this.interview = interview;
		this.interviewDate = interviewDate;
		this.contactAtCompany = contactAtCompany;
		this.linkToJob = linkToJob;
		this.technologies = technologies;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isApplied() {
		return applied;
	}

	public void setApplied(boolean applied) {
		this.applied = applied;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateApplied() {
		return dateApplied;
	}

	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}

	public boolean isInterview() {
		return interview;
	}

	public void setInterview(boolean interview) {
		this.interview = interview;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getContactAtCompany() {
		return contactAtCompany;
	}

	public void setContactAtCompany(String contactAtCompany) {
		this.contactAtCompany = contactAtCompany;
	}

	public String getLinkToJob() {
		return linkToJob;
	}

	public void setLinkToJob(String linkToJob) {
		this.linkToJob = linkToJob;
	}

	public ArrayList<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (applied ? 1231 : 1237);
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((contactAtCompany == null) ? 0 : contactAtCompany.hashCode());
		result = prime * result + ((dateApplied == null) ? 0 : dateApplied.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (interview ? 1231 : 1237);
		result = prime * result + ((interviewDate == null) ? 0 : interviewDate.hashCode());
		result = prime * result + ((linkToJob == null) ? 0 : linkToJob.hashCode());
		result = prime * result + ((technologies == null) ? 0 : technologies.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		if (applied != other.applied)
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (contactAtCompany == null) {
			if (other.contactAtCompany != null)
				return false;
		} else if (!contactAtCompany.equals(other.contactAtCompany))
			return false;
		if (dateApplied == null) {
			if (other.dateApplied != null)
				return false;
		} else if (!dateApplied.equals(other.dateApplied))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (interview != other.interview)
			return false;
		if (interviewDate == null) {
			if (other.interviewDate != null)
				return false;
		} else if (!interviewDate.equals(other.interviewDate))
			return false;
		if (linkToJob == null) {
			if (other.linkToJob != null)
				return false;
		} else if (!linkToJob.equals(other.linkToJob))
			return false;
		if (technologies == null) {
			if (other.technologies != null)
				return false;
		} else if (!technologies.equals(other.technologies))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Job [company=" + company + ", applied=" + applied + ", title=" + title + ", description=" + description
				+ ", dateApplied=" + dateApplied + ", interview=" + interview + ", interviewDate=" + interviewDate
				+ ", contactAtCompany=" + contactAtCompany + ", linkToJob=" + linkToJob + ", technologies="
				+ technologies + "]";
	}
	

}
