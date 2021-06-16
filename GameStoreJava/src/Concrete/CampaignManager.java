package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("YENÝ KAMPANYA EKLENDÝ");
		System.out.println("EKLENEN KAMPANYA DETAYLARI");
		System.out.println("KAMPANYA ADI : "+campaign.getCampaignName());
		System.out.println("KAMPANYA BÝLGÝSÝ : "+campaign.getInformation());
		System.out.println("KAMPANYA ÝNDÝRÝMÝ : "+campaign.getDiscount());
		System.out.println("KAMPANYA BAÞLANGIÇ TARÝHÝ : "+campaign.getStartDay());
		System.out.println("KAMPANYA BÝTÝÞ TARÝHÝ : "+campaign.getFinishDate());
		
		System.out.println("------------------------------------------------------");


		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("BU KAMPANYA SÝLÝNDÝ");
		System.out.println("SÝLÝNEN KAMPANYA DETAYLARI");
		System.out.println("KAMPANYA ADI : "+campaign.getCampaignName());
		System.out.println("KAMPANYA BÝLGÝSÝ : "+campaign.getInformation());
		System.out.println("KAMPANYA ÝNDÝRÝMÝ : "+campaign.getDiscount());
		System.out.println("KAMPANYA BAÞLANGIÇ TARÝHÝ : "+campaign.getStartDay());
		System.out.println("KAMPANYA BÝTÝÞ TARÝHÝ : "+campaign.getFinishDate());
		
		System.out.println("------------------------------------------------------");

		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("BU KAMPANYA GÜNCELLENDÝ");
		System.out.println("KAMPANYA DETAYLARI");
		System.out.println("KAMPANYA ADI : "+campaign.getCampaignName());
		System.out.println("KAMPANYA BÝLGÝSÝ : "+campaign.getInformation());
		System.out.println("KAMPANYA ÝNDÝRÝMÝ : "+campaign.getDiscount());
		System.out.println("KAMPANYA BAÞLANGIÇ TARÝHÝ : "+campaign.getStartDay());
		System.out.println("KAMPANYA BÝTÝÞ TARÝHÝ : "+campaign.getFinishDate());
		
		System.out.println("------------------------------------------------------");

		
	}

}
