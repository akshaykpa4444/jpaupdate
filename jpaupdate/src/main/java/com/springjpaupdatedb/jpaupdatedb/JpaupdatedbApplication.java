package com.springjpaupdatedb.jpaupdatedb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springjpaupdatedb.jpaupdatedb.exception.MyException;

@SpringBootApplication
public class JpaupdatedbApplication implements CommandLineRunner {

	public static void main(String[] args) throws MyException {
		SpringApplication.run(JpaupdatedbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
