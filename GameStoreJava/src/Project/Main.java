package Project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;
import Entity.Sales;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		// GAMER OPERATION
		Gamer gamer=new Gamer(1,"aziz","avcý",1994,"123456789","aziz123");
		
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		
	
		// CAMPAIGN OPERATION
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date startDate = df.parse("16-06-2021");
        Date finishDate = df.parse("17-06-2021");

		Campaign campaign=new Campaign(1,"THE GAME FEAST", "YEPYENÝ OYUNLAR SÝZÝ BEKLER", 12,startDate,finishDate);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		
		// GAME OPERATION
		Game game=new Game(1,"GOD OF WAR", "EPIC-OPEN PLATFORM","Capcom, Sony Picture".toUpperCase(),189.99,campaign.getDiscount());
		
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		
		
		// SALES OPERATION
		SalesManager salesManager=new SalesManager();
		salesManager.add(game, campaign, gamer);
		
		
		
		
		
		
			
		

	}

}
