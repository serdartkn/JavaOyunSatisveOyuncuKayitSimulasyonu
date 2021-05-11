package gameSimulatior;

import java.time.LocalDate;

import adapter.RealPlayerCheckAdapter;
import business.concretes.CampaignManager;
import business.concretes.FakePlayerCheckManager;
import business.concretes.GameManager;
import business.concretes.PlayerManager;
import business.concretes.SaleManager;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Player;
import entities.concretes.Sale;

public class Main {

	public static void main(String[] args) {
		
		
		Player player1 = new Player();
		player1.setId(1);
		player1.setFirstNameString("Serdar");
		player1.setLastName("Tekin");
		player1.setNationalityId("45874425478");
		player1.setDateOfBirthDate(LocalDate.of(1996, 9, 13));		
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("CS:GO");
		game1.setPrice(153);
		game1.setDescription("Klasik CS-1.6 Heyecanýný Þimdi Yeniden Keþfedin.");		
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Bahar Kampanyasý");
		campaign1.setDiscountPercent(15);
		
		Sale sale1 = new Sale();
		sale1.setId(1);
		sale1.setGame(game1);
		sale1.setPlayer(player1);	


		PlayerManager playerManager = new PlayerManager(new RealPlayerCheckAdapter());
		playerManager.add(player1);		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.add(sale1);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.add(sale1, campaign1);

	}

}
