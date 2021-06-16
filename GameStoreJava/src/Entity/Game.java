package Entity;

public class Game {

	private int id;
	private String name;
	private String kind;
	private String information;
	private double unitPrice;
	private int discount;
	private double unitPriceAfterCampaign;
	
	
	public Game() {	
		
	}


	public Game(int id, String name, String kind, String information,double unitPrice,int discount) {

		this.id = id;
		this.name = name;
		this.kind = kind;
		this.information = information;
		this.unitPrice = unitPrice;
		this.discount=discount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String getInformation() {
		return information;
	}


	public void setInformation(String information) {
		this.information = information;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public double getUnitPriceAfterCampaign() {
		return this.unitPrice-(this.unitPrice*discount/100);
	}


	public void setUnitPriceAfterCampaign(double unitPriceAfterCampaign) {
		this.unitPriceAfterCampaign = unitPriceAfterCampaign;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	
	


	
	
}
