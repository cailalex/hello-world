package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(method=RequestMethod.GET, value="/java-is-cool", produces="application/json")
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<String>("My first Controller method", HttpStatus.OK);
	}
	
}
