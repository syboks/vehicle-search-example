package com.syboks.vehicle.search.example.dao;

import com.syboks.vehicle.search.example.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerDAO extends JpaRepository<Manufacturer, Integer> {
}
