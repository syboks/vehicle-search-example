package com.syboks.vehicle.search.example.controller;

import com.syboks.vehicle.search.example.entity.Manufacturer;
import com.syboks.vehicle.search.example.exception.ManufacturerNotFoundException;
import com.syboks.vehicle.search.example.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @PostMapping
    public ResponseEntity<Manufacturer> createManufacturer(
            @RequestBody Manufacturer manufacturer){
        Manufacturer dbRecord=manufacturerService.saveManufacturer(manufacturer);
        return  new ResponseEntity<>(dbRecord, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Manufacturer>> getAllmanufacturers(){
        List<Manufacturer> savedManufacturers=manufacturerService.fetchAllManufacturers();
        return ResponseEntity.status(HttpStatus.OK).body(savedManufacturers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manufacturer> getManufacturerBasedOnId(@PathVariable int id) throws ManufacturerNotFoundException {
        Manufacturer dbManufacturer=manufacturerService.getManufacturerForId(id);
        if(dbManufacturer==null){
            throw new ManufacturerNotFoundException("No manufacturer found for ID-"+id);
        }
        return ResponseEntity.ok(dbManufacturer);
    }
}
