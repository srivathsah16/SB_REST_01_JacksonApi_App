package com.srivath;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.srivath.databind.Address;
import com.srivath.databind.Person;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		Address address = new Address(1, "abc Street", "Mysore", "Karnataka", "India");
		Person person= new Person(1, "Ravi", "Male", "ravi@gmail.com", address);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("person.json"), person);
		System.out.println("Json generated");
	}

}
