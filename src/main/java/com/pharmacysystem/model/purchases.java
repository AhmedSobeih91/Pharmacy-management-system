package com.pharmacysystem.model;

public class purchases {
	private int code;
	private String Product_Name;
	private String Production_Date;
	private String expiry_Date;
	private int Quantity;
	private double Purchasing_price;
	private double selling_price;
	private double total;
	private String supplier_name;

	public purchases() {

	}

	public purchases(int code, String product_Name, String production_Date, String expiry_Date, int quantity,
			double purchasing_price, double selling_price, String supplier_name) {

		this.code = code;
		this.Product_Name = product_Name;
		this.Production_Date = production_Date;
		this.expiry_Date = expiry_Date;
		this.Quantity = quantity;
		this.Purchasing_price = purchasing_price;
		this.selling_price = selling_price;
		this.total = quantity * purchasing_price;
		this.supplier_name = supplier_name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public String getProduction_Date() {
		return Production_Date;
	}

	public void setProduction_Date(String production_Date) {
		Production_Date = production_Date;
	}

	public String getExpiry_Date() {
		return expiry_Date;
	}

	public void setExpiry_Date(String expiry_Date) {
		this.expiry_Date = expiry_Date;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getPurchasing_price() {
		return Purchasing_price;
	}

	public void setPurchasing_price(double purchasing_price) {
		Purchasing_price = purchasing_price;
	}

	public double getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(double selling_price) {
		this.selling_price = selling_price;
	}

	public double getTotal() {
		return total;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

}
