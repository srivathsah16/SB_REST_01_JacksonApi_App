package com.srivath;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.srivath.databind.Person;

public class JsonToJavaConverter {
	public static void main(String[] args) throws Exception {
		File file = new File("person.json");
		ObjectMapper mapper = new ObjectMapper();
		Person person = mapper.readValue(file, Person.class);
		System.out.println(person);
	}

}
