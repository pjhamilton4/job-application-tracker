package com.philiphamilton.reactspringdemo;

import com.philiphamilton.reactspringdemo.jobs.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}
