package model.entities;

import model.services.BrazilTaxService;

public class Invoice {
	private Double basicPayment;
	private Double tax;
	
	
	public Invoice(Double basicPayment, Double tax, BrazilTaxService brazilTaxService) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	
	public Double getBasicPayment() {
		return basicPayment;
	}
	
	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}
	
	public Double getTax() {
		return tax;
	}
	
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double totalPayment() {
		return getBasicPayment() + getTax();
	}
}
