package com.springjpaupdatedb.jpaupdatedb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpaupdatedb.jpaupdatedb.repository.StudentFileReading;

@RestController
public class UserController {

	@Autowired
	private StudentFileReading studentFileReader;

	@RequestMapping("/uploaded")
	public String setStudentDataInfo() {
		try {
			studentFileReader.userData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "updated";
	}

}
