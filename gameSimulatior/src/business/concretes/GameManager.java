package business.concretes;

import business.abstracts.GameService;
import entities.concretes.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {

		if(game.getGameName().length()<2 && game.getPrice()<0) 
		{
			System.out.println("Eksik Oyun Bilgisi Mevcut");
		}
		else 
		{
			System.out.println("Oyun Sisteme Ba�ar�yla Eklendi: " + game.getGameName());
		}
		
	}

	@Override
	public void update(Game game) {
		
		if(game.getGameName().length()<2 && game.getPrice()<0) 
		{
			System.out.println("Eksik Oyun Bilgisi Mevcut");
		}
		else 
		{
			System.out.println("Oyun Ba�ar�yla G�ncellendi: " + game.getGameName());
		}		
		
	}

	@Override
	public void delete(Game game) 
	{
		if(game.getGameName().length()<2 && game.getPrice()<0) 
		{
			System.out.println("Eksik Oyun Bilgisi Mevcut");
		}
		else 
		{
			System.out.println("Oyun Ba�ar�yla Silindi");
		}		
		
	}

}
