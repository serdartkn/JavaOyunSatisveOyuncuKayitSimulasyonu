package business.abstracts;

import entities.concretes.Campaign;

public interface CampaignService {
	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);

}
