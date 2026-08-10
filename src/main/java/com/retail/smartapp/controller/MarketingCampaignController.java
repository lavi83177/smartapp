package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.MarketingCampaign;
import com.retail.smartapp.service.MarketingCampaignService;

@RestController
@RequestMapping("/marketing-campaigns")
public class MarketingCampaignController {

    @Autowired
    private MarketingCampaignService marketingCampaignService;

    @GetMapping
    public List<MarketingCampaign> getAllMarketingCampaign() {
        return marketingCampaignService.getAllMarketingCampaign();
    }

    @GetMapping("/{id}")
    public Optional<MarketingCampaign> getMarketingCampaignById(
            @PathVariable Long id) {
        return marketingCampaignService.getMarketingCampaignById(id);
    }

    @PostMapping
    public MarketingCampaign saveMarketingCampaign(
            @RequestBody MarketingCampaign marketingCampaign) {
        return marketingCampaignService.CreateMarketingCampaign(
                marketingCampaign);
    }

    @DeleteMapping("/{id}")
    public String deleteMarketingCampaign(@PathVariable Long id) {
        marketingCampaignService.deleteMarketingCampaign(id);
        return "Marketing Campaign Deleted Successfully";
    }
}