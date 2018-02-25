package com.apex.main;

 class MyClass {
	 static int  number = 1;
	
}
 class TestGarbage{  
	 public void finalize(){System.out.println("object is garbage collected");}  
	 //public static void main(String args[]){  
	   
	  
	} 

public class Sample {
	static int number2 = 20;
	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		MyClass a = new MyClass();
//		System.out.println(a.number);
//		System.out.println(number2);
		TestGarbage s1=new TestGarbage();  
		  TestGarbage s2=new TestGarbage();  
		  s1=null;  
		  s2=null;  
		  System.gc(); 

	}

}
