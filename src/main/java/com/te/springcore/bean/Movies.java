package com.te.springcore.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movies {
	
	public Movies()
	{
		
	}
	
	private int id;
	private String mname;

}
