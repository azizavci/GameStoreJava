package Concrete;

import java.util.Calendar;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class SalesManager implements SaleService {

	@Override
	public void add(Game game, Campaign campaign, Gamer gamer) {
		
		System.out.println("YENÝ SATIÞ BÝLGÝSÝ EKLENDÝ");
		System.out.println("SATIÞ DETAYLARI:");
		System.out.println("ALICI : "+ gamer.getFirstName()+" "+gamer.getLastName());
		System.out.println("OYUN ÝSMÝ : "+ game.getName());
		System.out.println("FÝYAT : "+game.getUnitPrice());
		System.out.println("ÝNDÝRÝMLÝ FÝYAT : "+game.getUnitPriceAfterCampaign());
		System.out.println("SATIÞ ZAMANI :" +Calendar.getInstance().getTime());
		
	}

	
	
}
