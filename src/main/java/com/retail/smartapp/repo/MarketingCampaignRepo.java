package com.retail.smartapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.smartapp.model.MarketingCampaign;

@Repository
public interface MarketingCampaignRepo extends JpaRepository<MarketingCampaign, Long> {

}
