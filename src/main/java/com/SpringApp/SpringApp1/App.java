package com.SpringApp.SpringApp1;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App 
{
	public static void main(String[] args) {

        System.out.println("Hey Java developer!!!!");

//        Student std = new Student(123,"Ram","Pune");
//
//        System.out.println(std);

         ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/Sushant/workspace/SpringApp1/src/beans.xml");

         Student std1 = (Student) context.getBean("student1");
         Student std2 = (Student) context.getBean("student2");

         System.out.println(std1);
         System.out.println(std2);

    }
}
