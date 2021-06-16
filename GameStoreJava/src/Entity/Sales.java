package Entity;

import java.util.Date;

public class Sales {

	private int id;
	private String boughtBy;
	private double totalPrice;
	private Date saleDay;
	
	public Sales() {

	}

	public Sales(int id, String boughtBy, double totalPrice, Date saleDay) {

		this.id = id;
		this.boughtBy = boughtBy;
		this.totalPrice = totalPrice;
		this.saleDay = saleDay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBoughtBy() {
		return boughtBy;
	}

	public void setBoughtBy(String boughtBy) {
		this.boughtBy = boughtBy;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getSaleDay() {
		return saleDay;
	}

	public void setSaleDay(Date saleDay) {
		this.saleDay = saleDay;
	}
	
	
	
	
	
	
	
}
