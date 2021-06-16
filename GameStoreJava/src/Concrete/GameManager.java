package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		
		System.out.println("YEN� OYUN EKLEND�");
		System.out.println("EKLENEN OYUN DETAYLARI");
		System.out.println("OYUN �SM� : "+game.getName());
		System.out.println("OYUN T�R� : "+game.getKind());
		System.out.println("OYUN B�LG�S� : "+game.getInformation());
		System.out.println("OYUN F�YATI : "+game.getUnitPrice());
		System.out.println("OYUN �ND�R�ML� F�YATI : "+game.getUnitPriceAfterCampaign());

		
		System.out.println("------------------------------------------------------");

		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("BU OYUN S�L�ND�");
		System.out.println("S�L�NEN OYUN DETAYLARI");
		System.out.println("OYUN �SM� : "+game.getName());
		System.out.println("OYUN T�R� : "+game.getKind());
		System.out.println("OYUN B�LG�S� : "+game.getInformation());
		System.out.println("OYUN F�YATI : "+game.getUnitPrice());
		System.out.println("OYUN �ND�R�ML� F�YATI : "+game.getUnitPriceAfterCampaign());

		
		System.out.println("------------------------------------------------------");

		
	}

	@Override
	public void update(Game game) {

		System.out.println("BU OYUN G�NCELLEND�");
		System.out.println("G�NCELLENEN OYUN DETAYLARI");
		System.out.println("OYUN �SM� : "+game.getName());
		System.out.println("OYUN T�R� : "+game.getKind());
		System.out.println("OYUN B�LG�S� : "+game.getInformation());
		System.out.println("OYUN F�YATI : "+game.getUnitPrice());
		System.out.println("OYUN �ND�R�ML� F�YATI : "+game.getUnitPriceAfterCampaign());

		
		System.out.println("------------------------------------------------------");

		
	}

}
