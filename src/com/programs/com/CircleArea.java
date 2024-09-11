package com.programs.com;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		
		int r=sc.nextInt();
		double area=Math.PI*r*r;
		
		System.out.println("The area of circle :" +area);
		
		
	}

}
