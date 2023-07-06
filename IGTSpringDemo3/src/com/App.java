package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

	public static void main(String[] args) {
        Resource r=new ClassPathResource("applicationContext.xml");

        BeanFactory factory=new XmlBeanFactory(r);
		
		Student s = (Student)factory.getBean("stud");
		s.display();

	}

}
