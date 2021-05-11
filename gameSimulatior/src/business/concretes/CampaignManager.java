package business.concretes;

import business.abstracts.CampaignService;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) 
	{

		if(campaign.getName().length()<2 && campaign.getDiscountPercent()<0) 
		{
			System.out.println("Kampanya Bilgileri Hatalý.");
		}
		else {
			System.out.println('"' + campaign.getName() + '"' + " Adlý Kampanya" + " %" +campaign.getDiscountPercent()
			+ " Ýndirim Oranýyla Sisteme Baþarýyla Eklendi." );			
		}	
		
	}

	@Override
	public void update(Campaign campaign) 
	{

		if(campaign.getName().length()<2 && campaign.getDiscountPercent()<0) 
		{
			System.out.println("Kampanya Bilgileri Hatalý.");
		}
		else {
			System.out.println("'" + campaign.getName() + "'" + " Adlý Kampanya" + " %" +campaign.getDiscountPercent()
			+ " Ýndirim Oranýyla Baþarýyla Güncellendi." );			
		}
		
	}

	@Override
	public void delete(Campaign campaign) 
	{

		System.out.println("'" + campaign.getName() + "'" + " Adlý Kampanya" + " Sistemden Baþarýyla Silindi." );
		
	}

}
