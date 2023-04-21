package com.syboks.vehicle.search.example.service.impl;

import com.syboks.vehicle.search.example.dao.ManufacturerDAO;
import com.syboks.vehicle.search.example.entity.Manufacturer;
import com.syboks.vehicle.search.example.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerImpl implements ManufacturerService {

    @Autowired
    private ManufacturerDAO manufacturerDAO;

    @Override
    public Manufacturer saveManufacturer(Manufacturer manufacturer) {
        return manufacturerDAO.save(manufacturer);
    }

    @Override
    public List<Manufacturer> fetchAllManufacturers() {
        List<Manufacturer> dbManufacturers=manufacturerDAO.findAll();
        return dbManufacturers;
    }
}
