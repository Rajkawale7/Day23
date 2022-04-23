package com.bridgelabz;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {

	public static void main(String[] args) {
		//Regex to check some valid Email Samples
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(regex);
		
		String Email1 = "Rajkawal00@gmail.com";		
		System.out.println(Pattern.compile(regex).matcher(Email1).matches());

		String Email2 = "rajkawale@gmail.com";		
		System.out.println(Pattern.compile(regex).matcher(Email2).matches());
		String Email3 = "raj_kawale@gmail.com";		
		System.out.println(Pattern.compile(regex).matcher(Email3).matches());

		String Email4 = "712@gmail.com";		
		System.out.println(Pattern.compile(regex).matcher(Email4).matches());

		String Email5 = "712@gmail.";		
		System.out.println(Pattern.compile(regex).matcher(Email5).matches());

		String Email6 = "RAJ712@GMAIL.COM";		
		System.out.println(Pattern.compile(regex).matcher(Email6).matches());
		
		if (m.find()) {
			System.out.println("Match found");
		}
		else {
			System.out.println("Match not found");
		}
	}
} 