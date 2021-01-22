package com.springjpaupdatedb.jpaupdatedb.repository;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	public void insertIntoDb( long id, String name, int age,  String sub, int marks);

}
