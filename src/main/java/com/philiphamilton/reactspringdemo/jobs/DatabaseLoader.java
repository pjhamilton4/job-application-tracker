package com.philiphamilton.reactspringdemo.jobs;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner{

	private final JobRepository repo;
	
	@Autowired
	public DatabaseLoader(JobRepository repo) {
		this.repo = repo;
	}

	@Override
	public void run(String... args) throws Exception {
		this.repo.save(new Job("VALCOM", false, "SOFTWARE DEVELOPER", "DEVELOPS SOFTWARE", new Date(), false, null, "Tom Bolder", "http://www.google.com", new ArrayList<String>()));
		this.repo.save(new Job("CDYNE", false, "SOFTWARE DEVELOPER", "DEVELOPS SOFTWARE", new Date(), false, null, "Tom Bolder", "http://www.google.com", new ArrayList<String>()));
		this.repo.save(new Job("VALCOM", false, "SOFTWARE DEVELOPER", "DEVELOPS SOFTWARE", new Date(), false, null, "Tom Bolder", "http://www.google.com", new ArrayList<String>()));
	}
}
