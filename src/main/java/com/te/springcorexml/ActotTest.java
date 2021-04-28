package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Actor;

public class ActotTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("actor.xml");
		Actor actor =(Actor)context.getBean("act");
		System.out.println(actor.getId());
		System.out.println(actor.getName());
		System.out.println(actor.getGender());
		System.out.println(actor.getMov().getId());
		System.out.println(actor.getMov().getMname());
		((AbstractApplicationContext)context).close();

	}

}
