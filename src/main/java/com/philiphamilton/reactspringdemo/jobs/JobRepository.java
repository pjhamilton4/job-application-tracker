package com.philiphamilton.reactspringdemo.jobs;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins ={ "http://localhost:3000", "http://localhost:4200" })
public interface JobRepository extends CrudRepository<Job, Long> {

}
