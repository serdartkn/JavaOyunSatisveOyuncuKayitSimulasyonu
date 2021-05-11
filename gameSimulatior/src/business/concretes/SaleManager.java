package business.concretes;

import business.abstracts.SaleService;
import entities.concretes.Campaign;
import entities.concretes.Sale;

public class SaleManager implements SaleService{

	@Override
	public void add(Sale sale) {
		
		System.out.println("Sayýn" + " " + sale.getPlayer().getFirstNameString() + " " + 
		sale.getPlayer().getLastName() + " " +  '"' + sale.getGame().getGameName() + '"'  + " " + "Adlý Oyunu" + " " +
				sale.getGame().getPrice() + "TL Karþýlýðýnda Satýn Aldýnýz.");
		
	}
	
	public void add(Sale sale, Campaign campaign) {
		
		System.out.println("Sayýn" + " " + sale.getPlayer().getFirstNameString() + " " +
				sale.getPlayer().getLastName() + " " + '"' + sale.getGame().getGameName() + '"' + " " + "Adlý Oyunu" + " " + '"' + campaign.getName() + '"' + " " 
				+ "Ýle" + " " + "%" + campaign.getDiscountPercent() + " " + "Ýndirimli Olarak" 
		+ " " + (sale.getGame().getPrice()-(sale.getGame().getPrice()*campaign.getDiscountPercent()/100)) + "TL Karþýlýðýnda Satýn Aldýnýz." + "\n" 
				+ "*Bu Ýndirimden Kazancýnýz:" + " " + sale.getGame().getPrice()*campaign.getDiscountPercent()/100 + "TL");
		
	}

}
