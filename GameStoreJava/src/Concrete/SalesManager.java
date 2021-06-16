package Concrete;

import java.util.Calendar;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class SalesManager implements SaleService {

	@Override
	public void add(Game game, Campaign campaign, Gamer gamer) {
		
		System.out.println("YEN� SATI� B�LG�S� EKLEND�");
		System.out.println("SATI� DETAYLARI:");
		System.out.println("ALICI : "+ gamer.getFirstName()+" "+gamer.getLastName());
		System.out.println("OYUN �SM� : "+ game.getName());
		System.out.println("F�YAT : "+game.getUnitPrice());
		System.out.println("�ND�R�ML� F�YAT : "+game.getUnitPriceAfterCampaign());
		System.out.println("SATI� ZAMANI :" +Calendar.getInstance().getTime());
		
	}

	
	
}
