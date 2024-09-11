package com.programs.com;

public class BiggestNumber {
	//a=10 ,b=20 ,c=30
			//to find biggest number from above three numbers,we find
			//if a is biggest then a>b and a>c
			//if b is biggest then b>a and b>c
			//if c is biggest then c>a and c>b
			
	public static void main(String[] args) {
		int a=10,b=20,c=12;
		if(a>b && a>c) {
			
			System.out.println(a + "is a biggest number");
		
		}else if(b>a && b>c) {
			
			System.out.println( b +" is a biggest number");
		}else {
			System.out.println(c +" is a biggest number ");
			
		}
			
		

	}

}
