package cd.learning.bean.references.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("paymentGetway")
public class PaymentGetway {

	
	private String getWayType;
	private int billNo;

	@Value("#{beanOrder.itemName}")
	private String itemName;
	@Value("#{beanOrder.shippingAddress}")
	private String address;
	
	
	public String getGetWayType() {
		return getWayType;
	}
	public void setGetWayType(String getWayType) {
		this.getWayType = getWayType;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String displayInfo() {
		return "GetWay Type is ="+getWayType + "\n"+ "Bill Number :=" +billNo+ "\n"+"Item Name is :="+itemName +"\n"+ "Address is :="+address;
		
	}
	
}
