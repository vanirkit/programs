package com.programs.com;

import java.util.*;

public class BiggestNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number ");
		int a=sc.nextInt();
		System.out.println("Enter Second number ");
		int b=sc.nextInt();
		System.out.println("Enter Third number ");
		int c=sc.nextInt();
		 if(a>b && a>c) {
			 System.out.println(a +"is biggest number");
		 }else if(b>a && b>c) {
			 System.out.println(b + "is biggest number");

			 
		 }else {
			 System.out.println(c +  " is biggest number");

		 }


		

	}

}
