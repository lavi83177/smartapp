package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Inventory;
import com.retail.smartapp.model.MarketingCampaign;
import com.retail.smartapp.repo.InventoryRepo;
import com.retail.smartapp.repo.MarketingCampaignRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
	@Autowired
	private InventoryRepo inventoryRepo;
	public List<Inventory> getAllInventory(){
		return inventoryRepo.findAll();
	}
	public Optional<Inventory> getInventoryById(Long id){
		return inventoryRepo.findById(id);
	}
	public Inventory CreateInventory(Inventory inventory) {
		return inventoryRepo.save(inventory);
	}
	public void deleteInventory(Long id) {
		inventoryRepo.deleteById(id);
	}
}