package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.model.*;

public class CredentialService
{
	
	public String generateEmailAddress(Employee emp)
	{
		return emp.getFirstName()+ emp.getLastName()+"."+ emp.getDepartment()+"@"+"xyz.com";
	
	}
	
	public String generatePassword()
	{
		Random random=new Random();
		String allowedChars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*<>'";
		
		char[]password=new char[8];
		
		for(int i=0;i<8;i++)
		{
			int idx=random.nextInt(allowedChars.length());
			
			password[i]=allowedChars.charAt(idx);
		}
		
		return new String(password);
	}
	public void showCredential(Employee emp, String email, String password)
	{
		System.out.println("Hello" + emp.getFirstName());   
		System.out.println("Here are your details");
		System.out.println("Email:" +email);
		System.out.println("Password:" +password);

}
}