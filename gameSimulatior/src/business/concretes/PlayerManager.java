package business.concretes;

import business.abstracts.PlayerCheckService;
import business.abstracts.PlayerService;
import entities.concretes.Player;

public class PlayerManager implements PlayerService{
	
	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) 
	{
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		
		if(playerCheckService.checkIfRealPerson(player)) 
		{
			System.out.println("�ye Eklendi: " + player.getFirstNameString() + " " + player.getLastName());
		}
		else {
			System.out.println("�ye Bilgileri Hatal�");
		}		
		
	}

	@Override
	public void update(Player player) {
		
		if(playerCheckService.checkIfRealPerson(player))
		{
			System.out.println("�ye Bilgileri G�ncellendi: " + player.getFirstNameString() + " " + player.getLastName() );
		}
		else {
			System.out.println("�ye Bilgileri Hatal�");
		}
		
	}

	@Override
	public void delete(Player player) {
		
		System.out.println("�ye Silindi");
		
	}

}
