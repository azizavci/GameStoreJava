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
			
			System.out.println(gamer.getFirstName().toUpperCase()+" K���S� DO�RULANDI. KAYIT BA�ARILI!");
			
			System.out.println("------------------------------------------------------");

			

		}
		else {
			
			System.out.println("DO�RULANAMAYAN K��� B�LG�S�!BU K�ML�KTE B�R�N�N OLDU�UNDAN EM�N OLUN.");
			
			System.out.println("------------------------------------------------------");

		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getFirstName().toUpperCase()+" K���S�NE A�T B�LG�LER S�L�ND�!");
		
		System.out.println("------------------------------------------------------");

		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName().toUpperCase()+" K���S�NE A�T B�LG� G�NCELLEND�!");	
		
		System.out.println("------------------------------------------------------");

	
	}

}
