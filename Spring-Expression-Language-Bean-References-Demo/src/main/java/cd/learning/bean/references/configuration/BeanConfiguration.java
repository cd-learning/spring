package cd.learning.bean.references.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cd.learning.bean.references.model.Order;
import cd.learning.bean.references.model.PaymentGetway;

@Configuration
public class BeanConfiguration {

	@Bean(name="beanOrder")
	public Order hello() {
		return new Order();
	}

	@Bean(name="paymentGetway")
	public PaymentGetway payment() {
		return new PaymentGetway();
	}

}
