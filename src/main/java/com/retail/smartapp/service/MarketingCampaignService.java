package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.MarketingCampaign;
import com.retail.smartapp.repo.MarketingCampaignRepo;

@Service
public class MarketingCampaignService {

    @Autowired
    private MarketingCampaignRepo marketingCampaignRepo;

    // GET - Get All Marketing Campaigns
    public List<MarketingCampaign> getAllMarketingCampaign() {
        return marketingCampaignRepo.findAll();
    }

    // GET - Get Marketing Campaign By ID
    public Optional<MarketingCampaign> getMarketingCampaignById(Long id) {
        return marketingCampaignRepo.findById(id);
    }

    // POST - Create Marketing Campaign
    public MarketingCampaign CreateMarketingCampaign(
            MarketingCampaign marketingCampaign) {

        return marketingCampaignRepo.save(marketingCampaign);
    }

    // PUT - Update Marketing Campaign
    public MarketingCampaign updateMarketingCampaign(
            Long id,
            MarketingCampaign marketingCampaign) {

        MarketingCampaign existingCampaign =
                marketingCampaignRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Marketing Campaign not found with id: " + id));

        // Set your MarketingCampaign fields here

        return marketingCampaignRepo.save(existingCampaign);
    }

    // DELETE - Delete Marketing Campaign
    public void deleteMarketingCampaign(Long id) {
        marketingCampaignRepo.deleteById(id);
    }
}