package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.CredentialService;

public class Driver {
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

	System.out.println("Firstname:");
	String firstname=sc.next();

	System.out.println("Lastname:");
	String lastname=sc.next();

	System.out.println("Choose your dept:");
	System.out.println("1. Technical:");
	System.out.println("2. HumanResource:");
	System.out.println("3. Legal:");
	System.out.println("4. Admin:");

	int choice= sc.nextInt();

	Employee emp;

	switch(choice){
	case 1:
	emp=new Employee(firstname, lastname, "tech");
	break;

	case 2:
	emp=new Employee(firstname, lastname, "HR");
	break;

	case 3:
	emp=new Employee(firstname, lastname, "legal");
	break;

	case 4:
	emp=new Employee(firstname, lastname, "admin");
	break;

	default:
	System.out.println("incorrect choice");
	return;
	}

	CredentialService cs=new CredentialService();
	
	String email=cs.generateEmailAddress(emp);
	
	String password=cs.generatePassword();
	
	cs.showCredential(emp,email,password);
}
}