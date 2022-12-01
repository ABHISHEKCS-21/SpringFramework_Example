package com.mypack.bean;

public class CraditCardPayment implements IPayment {
	
	public CraditCardPayment() {
		System.out.println("*******CraditCardPayment::Constructor*******");
	}

	public boolean payBill(Double billAmt) {
		System.err.println("*****CreditCard payBill()::Called****");
		return true;
	}

}
