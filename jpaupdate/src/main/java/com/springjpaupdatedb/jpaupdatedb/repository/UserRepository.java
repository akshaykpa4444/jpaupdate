package com.springjpaupdatedb.jpaupdatedb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpaupdatedb.jpaupdatedb.model.StudentEntity;

@Repository
public interface UserRepository extends JpaRepository<StudentEntity, Long> {

}