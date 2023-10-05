package com.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student2 
{
	private int stId;
	private String stFirstName;
	private String stLastName;
	private int stAge;
	private String stCity;
}
