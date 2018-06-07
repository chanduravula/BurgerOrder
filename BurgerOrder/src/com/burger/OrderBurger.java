package com.burger;

public class OrderBurger {
	
	private String name;
	private int rate;
	private int disc;
	private String customerName;
	private String address;

	
	
	public OrderBurger(String name, int rate, int disc, String customerName, String address) {
		super();
		this.name = name;
		this.rate = rate;
		this.disc = disc;
		this.customerName = customerName;
		this.address = address;
	}

	public OrderBurger() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getDisc() {
		return disc;
	}
	public void setDisc(int disc) {
		this.disc = disc;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
