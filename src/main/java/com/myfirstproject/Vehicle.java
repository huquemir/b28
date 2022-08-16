package com.myfirstproject;

public class Vehicle {
	//Instance variable is when you have variable that is outside the
	//method but inside the class. Instance variable can be accessed
	//within the methods of the class
	
	//If you have a non static variable, you cannot use the same variable 
	//in a non static method
	static int price; 
	String color;
	int milage;
			   

	public static void main(String[] args) {
		
	//method body
		
		//Calling the method- there are 2 ways to call a method
		//If it is a static method, we can use the Classname.methodname 
		
		//If it is not a static method, then we have to create
		//an instance of the method
		Vehicle.boats();
		
		//For non static method, we have to create an object
		//from the instance of a Class
		//new keyword is used to create an object
		
		//Here is the formula:
		Vehicle obj = new Vehicle();
		obj.car();
		obj.airplane(0);
		obj.boats("15,000");;
		
		//The default values for the data types
		//the default value for int is 0
		//the default value for string is null
		//the default value for float is 0.0
		
		
		
		
		
		
	}
	//This is a void method
	void car(){
		//Variables within the method is called a local variable
		
	    price = 500;
		color = "Blue";
		milage = 30;
		String make = "Tesla";
		boolean lowPrice = false;
		
		System.out.println("The COLOR of the CAR is : "+color);
		System.out.println("The PRICE of the CAR is : "+price);
		 
	}
	
	void moped() {
		milage = 10;
		
	}
	
	
	//This is a non-void or a return type method
	 int motorcycle() {
		 //method body - where we write the code
		 
		 return 20;
	}
	 
	String trucks() {
		return "Ford"; 
	 }
	
	boolean isLowPrice() {
		return false;
	}
	 
	
	//Static or Global level methods - Can be accessed
	//from anywhere in the project
	 static void boats(){
			price = 10500;
			String color = "Red";
			int milage = 30;
			String make = "Concord";
			boolean lowPrice = false;
			
			System.out.println("The color of the BOAT is : "+color);
	 }
	 
	 static String buses() {
		 return "public";
	 }
	 
	 //Parameterized (within parenthesis) method, It is called
	 //argument method where we can pass a data.
	 //We store the data type and the variable in th parameter
	
	 void boats(String price){
		 
	 }
	 
	 
	 //method signature - the method name, the parenthesis,
	 //and the method body
	 void airplane(int speed){
		 
	 }
	 
	
	 private void trains() {
		 String passenger = "";
	 }
	 
	 //Use the protected access modifier when using 
	 //the inheritance property
	 protected void bicycle() {
		 
	 }
	 
	 
	 
	 
}
