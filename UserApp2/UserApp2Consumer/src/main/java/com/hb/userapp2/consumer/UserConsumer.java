package com.hb.userapp2.consumer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserConsumer {

	public List<String> findAll() {

		List<String> users = new ArrayList<>();
		try {
			FileReader reader = new FileReader(new File("users.txt"));
			BufferedReader buff = new BufferedReader(reader);
			String line;
			while ((line = buff.readLine()) != null) {
				users.add(line);
			}
			buff.close();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Error reading file");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error reading file");
		}
		return users;
	}

}
