package com.spring.cloud.server;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {

	@Value("${driverClassName}")
	String driverClassName;
	
	@Value("${url}")
	String url;
	
	@Value("${username}")
	String username;
	
	@Value("${password}")
	String password;
	
	@GetMapping(value="/db")
	public String getDBDetails() {
		Map<String, String> dbDetails = new HashMap<String, String>(); 
		dbDetails.put("driverClassName", driverClassName);
		dbDetails.put("url", url);
		dbDetails.put("username", username);
		return dbDetails.toString(); 
	}
}
