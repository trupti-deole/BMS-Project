package com.cjc.bms.app.model;
//tightly encapsulation achieve using private access modifier
//Inheritance achieve using Object class
//and also polymorphism (overriding) achieve using toString() method
public class Account {
	private int accNo;
	private String name;
	private long adharNo;
	private String panId;
	private long mobileNumber;
	private byte age;
	private String address;
	private double balance;
	private String emailId;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public String getPanId() {
		return panId;
	}
	public void setPanId(String panId) {
		this.panId = panId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Account No :" + accNo + "\n Accountant name:" + name + "\nAdharNo=" + adharNo + ", panId=" + panId
				+ "\nMobileNumber :" + mobileNumber + "\nAge=" + age + "\nAddress=" + address + "\nBalance=" + balance
				+ "\nEmailId=" + emailId ;
	}
	
	
	
}
