package com.syboks.vehicle.search.example.service;

import com.syboks.vehicle.search.example.entity.Manufacturer;

import java.util.List;

public interface ManufacturerService {
    Manufacturer saveManufacturer(Manufacturer manufacturer);
    List<Manufacturer> fetchAllManufacturers();
}
