package com.gt.payment;

public class UPIPayment {

	public String doPymentUsingPhonePe(long phoneno, double amount) {
		return "payment is happening from the phone number: "+phoneno+" using phonepe";
	}
	
	public String doPymentUsingGpay(long phoneno, double amount) {
		return "payment is happening from the phone number: "+phoneno+" using gpay";
	}
}
