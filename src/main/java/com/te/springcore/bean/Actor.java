package com.te.springcore.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Actor {
	
	public Actor()
	{
		
	}

	private int id;
	private String name;
	private String gender;
	
	private Movies mov;
}
