package com.mypack.bean;

public class PaymentProcessor {
	
	public  PaymentProcessor() {
		System.out.println("*****PaymentProcessor::Constructor*****)");
	}
	
	private IPayment ipayment;
	
	public void setIpayment(IPayment ipayment) {
		this.ipayment = ipayment;
	}



	public void doPayment(Double billAmt){
		boolean isPaymentDone=ipayment.payBill(billAmt);
		
		if(isPaymentDone) {
			System.out.print("Payment Compleated Successfully...");
		}else {
			System.out.println("Payment Failed....");
		}
		
	}

}
