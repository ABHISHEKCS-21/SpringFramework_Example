package com.mypack.bean;

public class ZetaCardPayment implements IPayment {
	
	public ZetaCardPayment() {
		System.out.println("*****ZetaCardPayment::constructor*****");
	}

	public boolean payBill(Double billAmt) {
		System.err.println("*****ZetaCard payBill()::Called****");
		return true;
	}

}
