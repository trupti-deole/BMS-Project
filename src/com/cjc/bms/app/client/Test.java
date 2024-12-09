package com.cjc.bms.app.client;

import java.util.Scanner;

import com.cjc.bms.app.model.Account;
import com.cjc.bms.app.serviceimpl.SBI;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		boolean flag=true;
		SBI ob1=new SBI();
		Scanner sc=new Scanner(System.in);
		
//		while(flag)
		while(true)
		{
			System.out.println("Enter choice which you want to do");
			System.out.println("1-Create account,2-ViewAccount details");
			System.out.println("3-Deposit money,4-Withdraw ,"
					+ "5-Balance check");
			System.out.println("Enter 6-exit");
			choice=sc.nextInt();
			
			if(choice==1)
			{
				ob1.createAccount();
			}
			else if(choice==2)
			{
				ob1.displayAllDetails();
			}
			else if(choice==3)
			{
				ob1.depositeMoney();
			}
			else if(choice==4)
			{
				ob1.withDraw();
			}
			else if(choice==5)
			{
				ob1.balanceCheck();
			}
			else if(choice==6)
			{
				System.exit(0); //it is used to terminate our prog
//				flag=false;
			}
			else
			{
				System.out.println("Invalid choice");
			}
		}

	}

}
