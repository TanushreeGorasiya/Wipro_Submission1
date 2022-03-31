package com.emailadress.demo;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validate {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		
		String EmailArray[] = {"tanushreegorasiya23@gmail.com","deep0406@gmail.com","sidvasaikar06@gmail.com","anushkagore06@gmail.com","dimpleingale23@gmail.com","amanpatel@gmail.com","hitesgosavi@gmail.com","aniketjadhav@gmail.com","parthdesai@gmail.com","kritikapatil@gmail.com","rishi@gmail.com","parikshitpote@gmail.com"};
		
		System.out.println("Enter your email address : ");
		String emailad = sc.nextLine();
		
		String pat = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		
		Pattern p = Pattern.compile(pat);
		Matcher mat = p.matcher(emailad);
		
		if(mat.matches()) {
			
			System.out.println("Valid email address");
			for(int i=0; i<EmailArray.length; i++) {
				
				if(EmailArray[i].contains(emailad)) {
					found = true;
					break;
				}
			}
			
			if(found)
				System.out.println("Valid user in the system with valid email address");
			else
			  System.out.println("InValid User in the system with valid email address");
		}

		else {
			
			System.out.println("Invalid email address");		
		}	
	}
}

