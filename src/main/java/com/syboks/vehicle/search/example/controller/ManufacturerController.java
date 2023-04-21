package com.syboks.vehicle.search.example.controller;

import com.syboks.vehicle.search.example.entity.Manufacturer;
import com.syboks.vehicle.search.example.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
