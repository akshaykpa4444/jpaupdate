package com.springjpaupdatedb.jpaupdatedb.repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.springjpaupdatedb.jpaupdatedb.model.StudentData;
import com.springjpaupdatedb.jpaupdatedb.model.StudentMarks;
import com.sun.istack.logging.Logger;

@Configuration
public class StudentFileReading {
	private Logger logger = Logger.getLogger(StudentFileReading.class.getName(), null);

	@Autowired 
	private UserService userService;			 

	@SuppressWarnings("resource")
	public void userData() {
		List<StudentData> dataList = new ArrayList<StudentData>();
		List<StudentMarks> marksList = new ArrayList<StudentMarks>();
		try {
			BufferedReader readData = new BufferedReader(
					new FileReader("E:\\Data\\Trainee4\\workspace/StudentInfo.csv"));
			BufferedReader readMarks = new BufferedReader(
					new FileReader("E:\\Data\\Trainee4\\workspace/StudentMarksInfo2.csv"));
			String stuData = "";
			readData.readLine();
			while ((stuData = readData.readLine()) != null) {
				String[] dataInfo = stuData.split(",");
				StudentData data = new StudentData();
				data.setId(Long.valueOf(dataInfo[0]));
				data.setName((dataInfo[1]));
				data.setAge(Integer.valueOf(dataInfo[2]));
				dataList.add(data);
			}
			String marksData = "";
			readMarks.readLine();
			while ((marksData = readMarks.readLine()) != null) {
				String[] marksInfo = marksData.split(",");
				StudentMarks marks = new StudentMarks();
				marks.setId(Long.valueOf(marksInfo[0]));
				marks.setSub((marksInfo[1]));
				marks.setMarks(Integer.valueOf(marksInfo[2]));
				marksList.add(marks);
			}
			for (int i = 0; i < dataList.size(); i++) {
				for (int j = 0; j < marksList.size(); j++) {
					if (dataList.get(i).getId() == marksList.get(j).getId()) {
						userService.insertIntoDb(dataList.get(i).getId(), dataList.get(i).getName(),
								dataList.get(i).getAge(), marksList.get(j).getSub(), marksList.get(j).getMarks());
					}
				}
			}

		} catch (FileNotFoundException e) {
			logger.log(Level.INFO, "occured during reading csv file", e);
		} catch (IOException z) {
			logger.log(Level.WARNING, "connection into dataBase error ", z);
		} catch (Exception y) {
			logger.log(Level.SEVERE, "unknown problem, start debugging ", y);
		}

	}

}
