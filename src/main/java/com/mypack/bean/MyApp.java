package com.mypack.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyApp {

	public static void main(String[] args) {
		Resource resourse=new ClassPathResource("Beans.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resourse);
		/*
		 * beanFactory.getBean("credit",CraditCardPayment.class);
		 * beanFactory.getBean("Debit",DebitCardPayment.class);
		 * beanFactory.getBean("zeta",ZetaCardPayment.class);
		 */
		PaymentProcessor pp = beanFactory.getBean("paymentpro",PaymentProcessor.class);
		pp.doPayment(14000.00);
		
	}

}
