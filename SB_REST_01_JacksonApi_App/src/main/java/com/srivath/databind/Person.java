package com.srivath.databind;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private Integer id;
	private String name;
	private String gender;
	private String email;
	private Address address;
}
