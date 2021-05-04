package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campaing implements Entity {
	int id;
	String name;
	String campaingCode;
	String campaingDetail;
	Double discountRate;
	
	public Campaing(int id, String name, String campaingCode, Double discountRate,String campaingDetail) {
		super();
		this.id = id;
		this.name = name;
		this.campaingCode = campaingCode;
		this.discountRate = discountRate;
		this.campaingDetail= campaingDetail;
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
	public String getCampaingCode() {
		return campaingCode;
	}
	public void setCampaingCode(String campaingCode) {
		this.campaingCode = campaingCode;
	}
	public Double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}
	public String getCampaingDetail() {
		return campaingDetail;
	}
	public void setCampaingDetail(String campaingInformation) {
		this.campaingDetail = campaingInformation;
	}
}