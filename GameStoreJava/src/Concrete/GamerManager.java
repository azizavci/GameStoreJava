package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entity.Gamer;

public class GamerManager implements GamerService {

	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
		
	}

	@Override
	public void add(Gamer gamer) {
		
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			
			System.out.println(gamer.getFirstName().toUpperCase()+" KÝÞÝSÝ DOÐRULANDI. KAYIT BAÞARILI!");
			
			System.out.println("------------------------------------------------------");

			

		}
		else {
			
			System.out.println("DOÐRULANAMAYAN KÝÞÝ BÝLGÝSÝ!BU KÝMLÝKTE BÝRÝNÝN OLDUÐUNDAN EMÝN OLUN.");
			
			System.out.println("------------------------------------------------------");

		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getFirstName().toUpperCase()+" KÝÞÝSÝNE AÝT BÝLGÝLER SÝLÝNDÝ!");
		
		System.out.println("------------------------------------------------------");

		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName().toUpperCase()+" KÝÞÝSÝNE AÝT BÝLGÝ GÜNCELLENDÝ!");	
		
		System.out.println("------------------------------------------------------");

	
	}

}
