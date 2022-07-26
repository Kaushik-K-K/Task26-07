package com.spring.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.spring.model.EmployeeDetails;
import com.spring.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRep;
	
	String line ="";
//	@Scheduled(fixedRate = 10000)
	public void  saveEmpDetails() {
		try {
			BufferedReader br =new BufferedReader(new FileReader("src/main/resources/EmployeeDetails.csv"));
			while((line = br.readLine())!=null) {
				String [] data = line.split("	");
				EmployeeDetails emp = new EmployeeDetails();
				emp.setEmpName(data[0]);
				emp.setEmpId(data[1]);
				emp.setEmpDepartment(data[2]);
				emp.setEmpAddress(data[3]);
				emp.setEmpSalary(data[4]);
				empRep.save(emp);
				
			}
		
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	
	
}
