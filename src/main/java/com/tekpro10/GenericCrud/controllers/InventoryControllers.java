package com.tekpro10.GenericCrud.controllers;

import com.tekpro10.GenericCrud.entities.InventoryEntity;
import com.tekpro10.GenericCrud.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/inventory")
public class InventoryControllers {
    @Autowired
    InventoryRepository inventoryRepository;

    @GetMapping(value = "checkAPI")
    public String show(){
        return "sukses";
    }

    @PostMapping(value = "addNewProduct")
    public InventoryEntity addNewProduct(@RequestBody InventoryEntity input){
        inventoryRepository.save(input);
        return input;
    }

    @GetMapping(value = "getAllProduct")
    public List<InventoryEntity> getAllProduct(){
        return inventoryRepository.findAll();
    }

    @GetMapping(value = "getById")
    public InventoryEntity getById(@RequestParam int id){
        return inventoryRepository.findById(id).get();
    }

    @PostMapping(value = "updateProduct")
    public String updateProduct(@RequestBody InventoryEntity param){
        return inventoryRepository.save(param).toString();
    }

    @GetMapping(value = "deleteProduct")
    public String deleteCar(@RequestParam int id){
        inventoryRepository.deleteById(id);
        return "Proses penghapusan product dengan id :"+id+ " berhasil";
    }

    
}
