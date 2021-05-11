package business.concretes;

import business.abstracts.PlayerCheckService;
import entities.concretes.Player;

public class FakePlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		return true;
	}

}
