package com.learn.main;

import java.util.Scanner;

import com.learn.model.Employee;
import com.learn.service.CredentialsService;

public class Main {
	
		
		@SuppressWarnings("resource")
		public static void main(String[] args) {
		
			
			Employee emp = new Employee("Sadia", "Fatima");
			CredentialsService credentialsService = new CredentialsService();
			
		
			System.out.println("\n Please enter the department from the following options");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resources");
			System.out.println("4. Legal");
			
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			
			String generatedEmail = null;
			String generatedPassword = null;
			
			switch(option) {
				case 1: {
					
					generatedEmail = credentialsService.generateEmailAddress(emp.getFirstName().toLowerCase(),
												emp.getLastName().toLowerCase(), "tech");
					generatedPassword = credentialsService.generatePassword();
					break;
				}
				case 2: {
					
					generatedEmail = credentialsService.generateEmailAddress(emp.getFirstName().toLowerCase(),
												emp.getLastName().toLowerCase(), "adm");
					generatedPassword = credentialsService.generatePassword();
					break;
				}
				case 3: {
					
					generatedEmail = credentialsService.generateEmailAddress(emp.getFirstName().toLowerCase(),
												emp.getLastName().toLowerCase(), "hr");
					generatedPassword = credentialsService.generatePassword();
					break;
				}
				case 4: {
					
					generatedEmail = credentialsService.generateEmailAddress(emp.getFirstName().toLowerCase(),
												emp.getLastName().toLowerCase(), "lg");
					generatedPassword = credentialsService.generatePassword();
					break;
				}
				default : {
					System.out.println("\n Kindly enter a valid department option. \n\n try again!!!");
					break;
				}
			}
			if(option <5) {
			
			emp.setEmail(generatedEmail);
			emp.setPassword(generatedPassword);
			credentialsService.showCredentials(emp);
			}
			
		}
	}

