package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.Inventory;
import com.retail.smartapp.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    // GET - Get All Inventory
    @GetMapping
    public List<Inventory> getAllInventory() {
        return inventoryService.getAllInventory();
    }

    // GET - Get Inventory By ID
    @GetMapping("/{id}")
    public Optional<Inventory> getInventoryById(
            @PathVariable Long id) {

        return inventoryService.getInventoryById(id);
    }

    // POST - Create Inventory
    @PostMapping
    public Inventory saveInventory(
            @RequestBody Inventory inventory) {

        return inventoryService.CreateInventory(inventory);
    }

    // PUT - Update Inventory
    @PutMapping("/{id}")
    public Inventory updateInventory(
            @PathVariable Long id,
            @RequestBody Inventory inventory) {

        return inventoryService.updateInventory(id, inventory);
    }

    // DELETE - Delete Inventory
    @DeleteMapping("/{id}")
    public String deleteInventory(@PathVariable Long id) {

        inventoryService.deleteInventory(id);

        return "Inventory Deleted Successfully";
    }
}