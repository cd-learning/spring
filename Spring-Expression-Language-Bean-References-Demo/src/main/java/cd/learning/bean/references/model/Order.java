package cd.learning.bean.references.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 

@Component("beanOrder")
public class Order {

	@Value("plastic_bag")
	private String itemName;
	@Value("145.60")
	private double price;
	@Value("Bholabhai Lati B/h krushna kumar shigi road Rajula City -365560")
	private String shippingAddress;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	
}
