package com.cjc.bms.app.serviceimpl;
import java.util.Scanner;

import com.cjc.bms.app.model.Account;
import com.cjc.bms.app.service.RBI;
//overriding achieve
public class SBI implements RBI {

//	int acno;
//	String name;
//	long adharno;
//	String panId;
//	long mobNo;
//	byte age;
//	String add;
//	double balance;
//	String emailId;
//	Account ob=new Account();
	Account ob=null;
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		ob=new Account();
 	  System.out.println("Enter account number");
// 	  acno=sc.nextInt();
 	  
 	  ob.setAccNo(sc.nextInt());
 	  System.out.println("Enter name");
// 	  name=sc.next()+sc.nextLine();
 	  ob.setName(sc.next()+sc.nextLine());
 	  System.out.println("Enter adhar no");
// 	  adharno=sc.nextLong();
 	  ob.setAdharNo(sc.nextLong());
 	  System.out.println("Enter pan Id");
// 	  panId=sc.next()+sc.nextLine();
 	  ob.setPanId(sc.next()+sc.nextLine());
 	  System.out.println("Enter mobile number");
// 	  mobNo=sc.nextLong();
 	  ob.setMobileNumber(sc.nextLong());
 	  System.out.println("Enter age");
// 	  age=sc.nextByte();
 	  ob.setAge(sc.nextByte());
 	  System.out.println("Enter address");
// 	  add=sc.next()+sc.nextLine();
 	  ob.setAddress(sc.next()+sc.nextLine());
 	  System.out.println("Enter balance");
// 	  balance=sc.nextDouble();
 	  ob.setBalance(sc.nextDouble());
 	  System.out.println("Enter Email Id");
// 	  emailId=sc.next()+sc.nextLine();
 	  ob.setEmailId(sc.next()+sc.nextLine());
 	}

	@Override
	public void displayAllDetails() {
		// TODO Auto-generated method stub
//		int accno1=ob.getAccNo();
//		System.out.println("Account number:"+ob.getAccNo());
//		String name1=ob.getName();
//		System.out.println("Accountant Name:"+name1);
//		long adharno1=ob.getAdharNo();
//		System.out.println("Adhar number:"+adharno1);
//		String panId1=ob.getPanId();
//		System.out.println("Pan Id:"+panId1);
//		long mobno1=ob.getMobileNumber();
//		System.out.println("Mobile Number:"+mobno1);
//		byte age1=ob.getAge();
//		System.out.println("Accountant age:"+age1);
//		String address1=ob.getAddress();
//		System.out.println("Accountant Address:"+address1);
//		double balance1=ob.getBalance();
//		System.out.println("Accountant balance:"+balance1);
//		String emailId1=ob.getEmailId();
//		System.out.println("Email Id:"+emailId1);
		if(ob!=null)
		{
			System.out.println("Account Details:"+ob);
		}
		else
		{
			System.out.println("Account does not exits! First Create your account");
		}
	}

	@Override
	public void depositeMoney() {
		// TODO Auto-generated method stub
//	 ob.setBalance();
		if(ob!=null)
		{
			System.out.println("Enter money which you want to deposit");
			int depositmoney=sc.nextInt();
			ob.setBalance(depositmoney+ob.getBalance());
			System.out.println("Balance="+ob.getBalance());
		}
		else
		{
			System.out.println("Account does not exits! First Create your account");
		}
		
		
	}
	@Override
	public void withDraw() 
	{
		// TODO Auto-generated method stub
		if(ob!=null)
		{
			System.out.println("Enter withdraw amount");
			int wamt=sc.nextInt();
	//		balance=balance-wamt;
			if((ob.getBalance()-500)>wamt)
			{
			  ob.setBalance(ob.getBalance()-wamt);
			  System.out.println("After withdraw balance is="+ob.getBalance());
			}
			else
			{
				System.out.println("Insufficient funds");
			}
		}
		else
		{
			System.out.println("Account does not exits! "
					+ "First Create your account");
		}
	}
    @Override
	public void balanceCheck() 
    {
		// TODO Auto-generated method stub
    	if(ob!=null)
		{
    		System.out.println("Available balance is:");
    		System.out.println("Balance="+ob.getBalance());
		}
    	else
    	{
    		System.out.println("Account does not exits! "
    				+ "First Create your account");
    	}
	}
	
}
