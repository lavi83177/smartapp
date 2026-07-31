package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.MarketingCampaign;
import com.retail.smartapp.model.Notification;
import com.retail.smartapp.repo.MarketingCampaignRepo;
import com.retail.smartapp.repo.NotificationRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MarketingCampaignService {
	@Autowired
	private MarketingCampaignRepo marketingCampaignRepo;
	public List<MarketingCampaign> getAllMarketingCampaign(){
		return marketingCampaignRepo.findAll();
	}
	public Optional<MarketingCampaign> getMarketingCampaignById(Long id){
		return marketingCampaignRepo.findById(id);
	}
	public MarketingCampaign CreateMarketingCampaign(MarketingCampaign marketingCampaign) {
		return marketingCampaignRepo.save(marketingCampaign);
	}
	public void deleteMarketingCampaign(Long id) {
		marketingCampaignRepo.deleteById(id);
	}
}