package cn.oops.exceptionhandling.exception;



public class A {
	public static void main(String[] args) {
		int a=50/0;
		
		String s=null;  
		System.out.println(s.length()); 
		
		String s="abc";  
		int i=Integer.parseInt(s);
		
		int a[]=new int[5];  
		a[10]=50; 
		
		int data=50/0;//may throw exception  
	    System.out.println("rest of the code..."); 
	}
}


