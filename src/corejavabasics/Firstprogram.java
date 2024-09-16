package corejavabasics;

//two class are interconnected we can share the data using object
//whatever the data we have in one class it can be used in another class as well using object initializer
//object has some properties and function. like man we have some properties and function. 
//object are the instance of class
//object are the reference of class. 

public class Firstprogram {
	
	int h=8;
	
	
	public int firstfn() {
		
		System.out.println(h);
		System.out.println("I am printing something");
		return h;
	}
	
	//objects are the instance/reference of a class

	public static void main(String[] a) {
		//sum of two numbers
		int a1 =5;
		int d=8;
		int c= a1+d;
		// TODO Auto-generated method stub
		//ln prints everything line by line
		Firstprogram fp= new Firstprogram();
		Secondprogram sn=new Secondprogram();
		
		
		System.out.println(sn.a);
		sn.secndfn();
		fp.firstfn();
		System.out.println("printing number is" + "" + fp.h);
		System.out.println("Welcome to java programming");
		System.out.println("I am Harish");
		System.out.println("my printing number is" + " " + a1);
		System.out.println(a1);
		
		System.out.println("total sum value is" + c);
		System.out.println("I am started to learn java programming");
	}

}
