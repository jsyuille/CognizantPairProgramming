package com.revature.configserver;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aggregateController {

	
	GetMapping("/api/experiment/**")
	public ResponseEntity<SpeedResult>() {
		//Gets user input
		//parses string for distance
		//converts distance using calculator service
		return ResponseEntity.ok(SpeedResult);
	}
	
	PostMapping("/api/experiment")
	public ResponseEntity<SpeedResult> () {
		//return object
		return ResponseEntity.ok(SpeedResult);
	}
}
