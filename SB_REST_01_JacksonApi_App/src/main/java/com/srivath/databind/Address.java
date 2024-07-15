package com.srivath.databind;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	private Integer doorNo;
	private String street;
	private String city;
	private String state;
	private String country;
}
