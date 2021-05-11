package business.concretes;

import business.abstracts.CampaignService;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) 
	{

		if(campaign.getName().length()<2 && campaign.getDiscountPercent()<0) 
		{
			System.out.println("Kampanya Bilgileri Hatal�.");
		}
		else {
			System.out.println('"' + campaign.getName() + '"' + " Adl� Kampanya" + " %" +campaign.getDiscountPercent()
			+ " �ndirim Oran�yla Sisteme Ba�ar�yla Eklendi." );			
		}	
		
	}

	@Override
	public void update(Campaign campaign) 
	{

		if(campaign.getName().length()<2 && campaign.getDiscountPercent()<0) 
		{
			System.out.println("Kampanya Bilgileri Hatal�.");
		}
		else {
			System.out.println("'" + campaign.getName() + "'" + " Adl� Kampanya" + " %" +campaign.getDiscountPercent()
			+ " �ndirim Oran�yla Ba�ar�yla G�ncellendi." );			
		}
		
	}

	@Override
	public void delete(Campaign campaign) 
	{

		System.out.println("'" + campaign.getName() + "'" + " Adl� Kampanya" + " Sistemden Ba�ar�yla Silindi." );
		
	}

}
