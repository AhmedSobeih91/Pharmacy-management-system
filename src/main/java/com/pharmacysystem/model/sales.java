package com.pharmacysystem.model;

public class sales {

	private int id;
	private int Code;
	private String Product_name;
	private int Quantity;
	private double Price;
	private double total;
	private String invoice_date;
	private int invoice_number;

	public sales() {

	}

	public sales(int code, String product_name, int quantity, double price, double total, String invoice_date,
			int invoice_number) {
		this.Code = code;
		this.Product_name = product_name;
		this.Quantity = quantity;
		this.Price = price;
		this.total = total;
		this.invoice_date = invoice_date;
		this.invoice_number = invoice_number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}

	public int getInvoice_number() {
		return invoice_number;
	}

	public void setInvoice_number(int invoice_number) {
		this.invoice_number = invoice_number;
	}

}
