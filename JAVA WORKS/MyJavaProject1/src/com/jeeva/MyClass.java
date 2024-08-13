         Employee Objects.

//package com.jeeva;
//
//class Employee {
//
//	 int employeeId;
//
//	    String employeeName;
//
//	    float employeeSalary;
//
//
//
//	    
//
//	    Employee(int employeeId, String employeeName, float employeeSalary) {
//
//	        this.employeeId = employeeId;
//
//	        this.employeeName = employeeName;
//
//	        this.employeeSalary = employeeSalary;
//
//	    }
//
//
//
//	    void display() {
//
//	        System.out.println("Employee Id: " + employeeId);
//
//	        System.out.println("Employee Name: " + employeeName);
//
//	        System.out.println("Employee Salary: " + employeeSalary);
//
//	    }
//
//	}
//
//
//
//	public class MyClass {
//
//	    public static void main(String[] args) {
//
//	        Employee emp1 = new Employee(101, "Jeeva", 2000.00f);
//
//	        emp1.display();
//
//	        Employee emp2 = new Employee(102, "Jeeva", 3000.00f);
//
//	        emp2.display();
//
//	    }
//
//	}



         TYPES OF VARIABLE
//public class MyClass {
//	int b = 20;
//	static int c = 30;
//	
//	public static void main(String[] args) {
//		int a = 10;
//		System.out.println("Local Variable : " + a);
//		MyClass obj = new MyClass();
//		System.out.println(obj.b);
//		System.out.println(MyClass.c);
//	}
//}

        METHODS IN JAVA:

//public class MyClass{
//	void myMethod1() {
//		System.out.println("Instance or object method");
//	}
//	static void myMethod2 () {
//		System.out.println("Static or class Method");
//	}
//	public static void main(String[] args) {
//		MyClass obj = new MyClass();
//		obj.myMethod1();
//		MyClass.myMethod2();
//		
//	}
//}
        this.keyword
 
//public class MyClass {
//	String name;
//	
//	MyClass(String name) {
//		this(10 , 20);
//		this.name = name;
//		this.greeting();
//	}
//	MyClass(int a , int b){
//		System.out.println("Sum :" + (a+b));
//	}
//	void greeting() {
//	System.out.println("Welcome " + name);
//}
//public static void main(String[] args ) {
//	MyClass obj = new MyClass("Jeeva");
//}
//}

        Method Overloading

//public class MyClass {
//	void myMethod(String name) {
//		System.out.println("Welcome " + name);
//	}
//	void myMethod(int a , int b) {
//		System.out.println("Addition :" + (a+b));
//	}
//	void myMethod(int n) {
//		int fact = 1;
//		for(int i = 1; i <=n;i++)
//			fact = fact * i;
//		System.out.println("Factorial :" + fact);
//	}
//	public static void main(String[] args) {
//		MyClass obj = new MyClass();
//		obj.myMethod(5);
//		obj.myMethod("Jeeva");
//		obj.myMethod(10 , 20);
//		
//	}
//}

      constructor Overloading   
//
//public class MyClass {
//	MyClass(String name) {
//		System.out.println("Welcome " + name);
//	}
//	MyClass(int a , int b) {
//		System.out.println("Addition :" + (a+b));
//	}
//	MyClass(int n) {
//		int fact = 1;
//		for(int i = 1; i <=n;i++)
//			fact = fact * i;
//		System.out.println("Factorial :" + fact);
//	}
//	public static void main(String[] args) {
//		MyClass obj1 = new MyClass(5);
//		MyClass obj2 = new MyClass("Jeeva");
//		MyClass obj3 = new MyClass(5,10);
//		
//	}
//}


        Constructor overloading using this.keyword
//
//public class MyClass {
//	MyClass(String name) {
//		System.out.println("Welcome " + name);
//	}
//	MyClass(int a , int b) {
//		this("Jeeva");
//		System.out.println("Addition :" + (a+b));
//	}
//	MyClass(int n) {
//		this(10, 20);
//		int fact = 1;
//		for(int i = 1; i <=n;i++)
//			fact = fact * i;
//		System.out.println("Factorial :" + fact);
//	}
//	public static void main(String[] args) {
//		MyClass obj1 = new MyClass(5);
//		
//		
//	}
//}
              ASSIGNMENT1
//public class MyClass {
//
//    class Student {
//        int regno;
//        String studentName;
//        int[] subjects = new int[5];
//
//        Student(int regno, String studentName) {
//            this.regno = regno;
//            this.studentName = studentName;
//        }
//
//        void setMarks(int[] marks) {
//            if (marks.length == subjects.length) {
//                System.arraycopy(marks, 0, subjects, 0, marks.length);
//            } else {
//                System.out.println("Incorrect number of marks provided.");
//            }
//        }
//
//        void displayInfo() {
//            System.out.println("Registration Number: " + regno);
//            System.out.println("Student Name: " + studentName);
//            System.out.print("Marks: ");
//            for (int mark : subjects) {
//                System.out.print(mark + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//        Student student = myClass.new Student(105, "Jeeva");
//        int[] marks = {85, 90, 78, 88, 92};
//        student.setMarks(marks);
//        student.displayInfo();
//    }
//}

		























