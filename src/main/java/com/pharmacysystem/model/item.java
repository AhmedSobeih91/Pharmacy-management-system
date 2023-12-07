package com.pharmacysystem.model;

public class item {
	private int code;
	private String name;
	private int quantity;
	private double price;
	private double total;

	public item() {

	}

	public item(int code, String name, int quantity, double price, double total) {

		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "invoi [code=" + code + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", total="
				+ total + "]";
	}

}
