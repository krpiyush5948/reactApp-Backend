package com.piyush.reactApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.reactApp.modal.Company;
import com.piyush.reactApp.repository.CompanyDao;

@Service
public class ServiceImpl {

	@Autowired
	private CompanyDao companyDao;

	/**
	 * this function return the list of company
	 * 
	 * @return
	 */


	public List<Company> getCompany() {
		return companyDao.findAll();
	}
/**
 * add the company
 * @param request
 */
	public void addCompany(com.piyush.reactApp.modal.Company request) {
		companyDao.save(request);
		
	}
	
}
