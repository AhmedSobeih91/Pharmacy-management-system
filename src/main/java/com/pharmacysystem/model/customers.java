package com.pharmacysystem.model;

public class customers {

	private int id;
	private String customer_name;
	private String invoice_date;
	private int invoice_number;

	public customers() {

	}

	public customers(String customer_name, String invoice_date, int invoice_number) {
		this.customer_name = customer_name;
		this.invoice_date = invoice_date;
		this.invoice_number = invoice_number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
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
