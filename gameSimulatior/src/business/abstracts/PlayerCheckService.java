package business.abstracts;

import entities.concretes.Player;

public interface PlayerCheckService {
	
	boolean checkIfRealPerson(Player player);

}
