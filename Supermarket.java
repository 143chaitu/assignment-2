package javalearning;

import java.util.Scanner;

public class Supermarket {


	public static void main(String[] args) {
		System.out.println("Enter the choice :");
		Scanner sc=new Scanner(System.in); 
		String ch;
		ch=sc.next();
		int x;
        final String NUTS = "nuts";
        final String OILS = "oils";
        final String SOAPS = "soaps";
		// TODO Auto-generated method stub
		switch(ch) {
		
			case NUTS:
				x=20000*10/100;
			System.out.println("The discount of nuts are "+x);
				
			case OILS:
				x=20000*5/100;
			System.out.println("The discount of oils are "+x);
				
			case SOAPS:
				x=20000*12/100;
			System.out.println("The discount of soaps are "+x);
				break;
			default: 
                System.out.println("Invalid choice.");
			
		}
		
			
		
		}
		
	}
