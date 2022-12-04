package com.learn.service;

import java.util.Random;

import com.learn.interfaces.ICredentials;
import com.learn.model.Employee;

public class CredentialsService implements ICredentials  {


	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		String emailAddress = firstName+lastName+"@"+department+".learn.com";
		
		return emailAddress;
	}
	
	
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String allValues = capitalLetters + smallLetters 
				+ numbers + specialCharacters;
		
		
		
		Random obj = new Random();			
		String password="";
		
		for (int i=0; i < 8; i++) {

			int boundValue = allValues.length();//70
			int randomIndex = obj.nextInt(boundValue);
			char randomChar = allValues.charAt(randomIndex);			
			password += String.valueOf(randomChar);
		}	
	
		return password;
	}

	public void showCredentials(Employee employee) {
		
		System.out.println("\n Dear "+employee.getFirstName() + " your generated credentials are as follows :");
		System.out.println("\n Email ID --> " + employee.getEmail());
		System.out.println("\n Password --> " +employee.getPassword());
	}
	
}

	

