package Entity;

import java.util.Date;

public class Campaign {

	private int id;
	private String campaignName;
	private String information;
	private int discount;
	private Date startDay;
	private Date finishDate;
	
	public Campaign() {

		
		
	}

	public Campaign(int id, String campaignName, String information, int discount, Date startDay, Date finishDate) {

		this.id = id;
		this.campaignName = campaignName;
		this.information = information;
		this.discount = discount;
		this.startDay = startDay;
		this.finishDate = finishDate;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Date getStartDay() {
		return startDay;
	}

	public void setStartDay(Date startDay) {
		this.startDay = startDay;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
	
	
	
	
}
