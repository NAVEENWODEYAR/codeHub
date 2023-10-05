package com.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class Laptop 
{
	private int lapId;
	private String lapName;
	private String lapMake;
	private double lapModel;
	private double lapPrice;
}
