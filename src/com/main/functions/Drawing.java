package com.main.functions;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void draw()
	{
		System.out.println("Inside draw method.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml") );
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Circle circle=(Circle) context.getBean("circle");
		circle.draw();

	}

}
