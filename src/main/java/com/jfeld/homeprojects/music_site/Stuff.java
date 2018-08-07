package com.jfeld.homeprojects.music_site;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Stuff {

	@RequestMapping("/hey")
	public void doStuff() {
		
		System.out.println("Testing my cool Spring Boot application!");
		
	}
	
}
