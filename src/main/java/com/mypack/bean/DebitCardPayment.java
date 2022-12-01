package com.mypack.bean;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("****DebitCardPayment::Constructor*****");
	}

	public boolean payBill(Double billAmt) {

		System.out.println("*****DebitCard payBill()::Called****");
		return true;
	}

}
