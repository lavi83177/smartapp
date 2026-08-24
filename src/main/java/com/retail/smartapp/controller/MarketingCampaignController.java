package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.MarketingCampaign;
import com.retail.smartapp.service.MarketingCampaignService;

@RestController
@RequestMapping("/api/marketing-campaigns")
public class MarketingCampaignController {

    @Autowired
    private MarketingCampaignService marketingCampaignService;

    // GET - Get All Marketing Campaigns
    @GetMapping
    public List<MarketingCampaign> getAllMarketingCampaign() {
        return marketingCampaignService.getAllMarketingCampaign();
    }

    // GET - Get Marketing Campaign By ID
    @GetMapping("/{id}")
    public Optional<MarketingCampaign> getMarketingCampaignById(
            @PathVariable Long id) {

        return marketingCampaignService.getMarketingCampaignById(id);
    }

    // POST - Create Marketing Campaign
    @PostMapping
    public MarketingCampaign saveMarketingCampaign(
            @RequestBody MarketingCampaign marketingCampaign) {

        return marketingCampaignService.CreateMarketingCampaign(
                marketingCampaign);
    }

    // PUT - Update Marketing Campaign
    @PutMapping("/{id}")
    public MarketingCampaign updateMarketingCampaign(
            @PathVariable Long id,
            @RequestBody MarketingCampaign marketingCampaign) {

        return marketingCampaignService.updateMarketingCampaign(
                id, marketingCampaign);
    }

    // DELETE - Delete Marketing Campaign
    @DeleteMapping("/{id}")
    public String deleteMarketingCampaign(@PathVariable Long id) {

        marketingCampaignService.deleteMarketingCampaign(id);

        return "Marketing Campaign Deleted Successfully";
    }
}