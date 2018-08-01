package cd.learning.bean.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cd.learning.bean.references.configuration.BeanConfiguration;
import cd.learning.bean.references.model.PaymentGetway;

public class ApplicationClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		PaymentGetway payment = (PaymentGetway) context.getBean("paymentGetway");
		payment.setGetWayType("PayPal VISA");

		payment.setBillNo(12);

		System.out.println(payment.displayInfo());

	}
}
