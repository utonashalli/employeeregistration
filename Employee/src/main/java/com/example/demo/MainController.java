package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;


@RestController
public class MainController {
	
	@RequestMapping("/print")
	public String print(){
		return "hi";
	}
	
	@Autowired
	private EmployeeRepository empRepository;
	
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	
	@RequestMapping(value="/registerEmployee" ,method = RequestMethod.POST)
	public  @ResponseBody Employee registerEmployee(@RequestBody Employee emp) {
		
		this.logger.debug("In registerEmployee");
		empRepository.save(emp);
		return emp;
	}
	
	


}
