package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Inventory;
import com.retail.smartapp.repo.InventoryRepo;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepo inventoryRepo;

    // GET - Get All Inventory
    public List<Inventory> getAllInventory() {
        return inventoryRepo.findAll();
    }

    // GET - Get Inventory By ID
    public Optional<Inventory> getInventoryById(Long id) {
        return inventoryRepo.findById(id);
    }

    // POST - Create Inventory
    public Inventory CreateInventory(Inventory inventory) {
        return inventoryRepo.save(inventory);
    }

    // PUT - Update Inventory
    public Inventory updateInventory(Long id, Inventory inventory) {

        Inventory existingInventory = inventoryRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Inventory not found with id: " + id));

        // Update Inventory fields here
        // Example:
        // existingInventory.setProductName(inventory.getProductName());
        // existingInventory.setQuantity(inventory.getQuantity());
        // existingInventory.setPrice(inventory.getPrice());

        return inventoryRepo.save(existingInventory);
    }

    // DELETE - Delete Inventory
    public void deleteInventory(Long id) {
        inventoryRepo.deleteById(id);
    }
}