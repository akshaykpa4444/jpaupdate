package com.springjpaupdatedb.jpaupdatedb.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpaupdatedb.jpaupdatedb.model.StudentEntity;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRep;

	@Override
	public void insertIntoDb(long id, String name, int age, String sub, int marks) {
		StudentEntity entity = new StudentEntity();
		entity.setId(id);
		entity.setName(name);
		entity.setAge(age);
		entity.setSub(sub);
		entity.setMarks(marks);
		userRep.save(entity);
	}
}
