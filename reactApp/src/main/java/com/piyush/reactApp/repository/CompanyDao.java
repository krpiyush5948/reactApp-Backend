package com.piyush.reactApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piyush.reactApp.modal.Company;

@Repository
public interface CompanyDao extends JpaRepository<Company,Integer> {

}
