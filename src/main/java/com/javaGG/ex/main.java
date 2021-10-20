package com.javaGG.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);		
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getHobbies());
		System.out.println(student1.getHeight());
		System.out.println(student1.getWeight());
		System.out.println();
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobbies());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		
		ctx.close();		
	}

}
