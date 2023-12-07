package com.pharmacysystem.model;

public class suppliers {

	private int id;
	private String supplier_name;
	private String address;
	private int tax_number;
	private long phone_number;

	public suppliers() {

	}

	public suppliers(int id, String supplier_name, String address, int tax_number, long phone_number) {
		this.id = id;
		this.supplier_name = supplier_name;
		this.address = address;
		this.tax_number = tax_number;
		this.phone_number = phone_number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsupplier_name() {
		return supplier_name;
	}

	public void setsupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTax_number() {
		return tax_number;
	}

	public void setTax_number(int tax_number) {
		this.tax_number = tax_number;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "suppliersimp [id=" + id + ", name=" + supplier_name + ", address=" + address + ", tax_number="
				+ tax_number + ", phone_number=" + phone_number + "]";
	}

}
