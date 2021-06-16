package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public interface SaleService {

	void add(Game game, Campaign campaign, Gamer gamer);
}
