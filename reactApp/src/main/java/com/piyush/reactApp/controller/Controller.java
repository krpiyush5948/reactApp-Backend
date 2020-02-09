package com.piyush.reactApp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.reactApp.modal.Company;
import com.piyush.reactApp.service.ServiceImpl;


@RestController
public class Controller {

	@Autowired
	private ServiceImpl service;
/**
 * this method returns the list of company
 * @return
 */
	@GetMapping(value="/getCompany")
	public List<Company> getCompany() {
		return service.getCompany();
	}
	
	@PostMapping("/addCompany")
	public void addCompany(@RequestBody Company request) {
		service.addCompany(request);
		
	}
}
