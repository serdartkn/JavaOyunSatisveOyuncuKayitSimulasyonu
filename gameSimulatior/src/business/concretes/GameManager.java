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
			System.out.println("Oyun Sisteme Başarıyla Eklendi: " + game.getGameName());
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
			System.out.println("Oyun Başarıyla Güncellendi: " + game.getGameName());
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
			System.out.println("Oyun Başarıyla Silindi");
		}		
		
	}

}
