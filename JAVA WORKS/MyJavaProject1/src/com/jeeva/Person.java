package com.jeeva;

public class Person {

	 private String name;
	    private int age;

	   
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	   
	    public void printDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	
	    public static void main(String[] args) {
	       
	        Person person1 = new Person("Jeeva", 30);
	        Person person2 = new Person("Bharathi", 25);
 
	        System.out.println("Details of Person 1:");
	        person1.printDetails();
	        System.out.println();

	        System.out.println("Details of Person 2:");
	        person2.printDetails();
	    }
	}