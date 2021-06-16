package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("YEN� KAMPANYA EKLEND�");
		System.out.println("EKLENEN KAMPANYA DETAYLARI");
		System.out.println("KAMPANYA ADI : "+campaign.getCampaignName());
		System.out.println("KAMPANYA B�LG�S� : "+campaign.getInformation());
		System.out.println("KAMPANYA �ND�R�M� : "+campaign.getDiscount());
		System.out.println("KAMPANYA BA�LANGI� TAR�H� : "+campaign.getStartDay());
		System.out.println("KAMPANYA B�T�� TAR�H� : "+campaign.getFinishDate());
		
		System.out.println("------------------------------------------------------");


		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("BU KAMPANYA S�L�ND�");
		System.out.println("S�L�NEN KAMPANYA DETAYLARI");
		System.out.println("KAMPANYA ADI : "+campaign.getCampaignName());
		System.out.println("KAMPANYA B�LG�S� : "+campaign.getInformation());
		System.out.println("KAMPANYA �ND�R�M� : "+campaign.getDiscount());
		System.out.println("KAMPANYA BA�LANGI� TAR�H� : "+campaign.getStartDay());
		System.out.println("KAMPANYA B�T�� TAR�H� : "+campaign.getFinishDate());
		
		System.out.println("------------------------------------------------------");

		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("BU KAMPANYA G�NCELLEND�");
		System.out.println("KAMPANYA DETAYLARI");
		System.out.println("KAMPANYA ADI : "+campaign.getCampaignName());
		System.out.println("KAMPANYA B�LG�S� : "+campaign.getInformation());
		System.out.println("KAMPANYA �ND�R�M� : "+campaign.getDiscount());
		System.out.println("KAMPANYA BA�LANGI� TAR�H� : "+campaign.getStartDay());
		System.out.println("KAMPANYA B�T�� TAR�H� : "+campaign.getFinishDate());
		
		System.out.println("------------------------------------------------------");

		
	}

}
