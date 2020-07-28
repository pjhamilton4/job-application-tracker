package com.philiphamilton.reactspringdemo.jobs;

import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {

}
