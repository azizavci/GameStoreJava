package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		
		System.out.println("YENÝ OYUN EKLENDÝ");
		System.out.println("EKLENEN OYUN DETAYLARI");
		System.out.println("OYUN ÝSMÝ : "+game.getName());
		System.out.println("OYUN TÜRÜ : "+game.getKind());
		System.out.println("OYUN BÝLGÝSÝ : "+game.getInformation());
		System.out.println("OYUN FÝYATI : "+game.getUnitPrice());
		System.out.println("OYUN ÝNDÝRÝMLÝ FÝYATI : "+game.getUnitPriceAfterCampaign());

		
		System.out.println("------------------------------------------------------");

		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("BU OYUN SÝLÝNDÝ");
		System.out.println("SÝLÝNEN OYUN DETAYLARI");
		System.out.println("OYUN ÝSMÝ : "+game.getName());
		System.out.println("OYUN TÜRÜ : "+game.getKind());
		System.out.println("OYUN BÝLGÝSÝ : "+game.getInformation());
		System.out.println("OYUN FÝYATI : "+game.getUnitPrice());
		System.out.println("OYUN ÝNDÝRÝMLÝ FÝYATI : "+game.getUnitPriceAfterCampaign());

		
		System.out.println("------------------------------------------------------");

		
	}

	@Override
	public void update(Game game) {

		System.out.println("BU OYUN GÜNCELLENDÝ");
		System.out.println("GÜNCELLENEN OYUN DETAYLARI");
		System.out.println("OYUN ÝSMÝ : "+game.getName());
		System.out.println("OYUN TÜRÜ : "+game.getKind());
		System.out.println("OYUN BÝLGÝSÝ : "+game.getInformation());
		System.out.println("OYUN FÝYATI : "+game.getUnitPrice());
		System.out.println("OYUN ÝNDÝRÝMLÝ FÝYATI : "+game.getUnitPriceAfterCampaign());

		
		System.out.println("------------------------------------------------------");

		
	}

}
