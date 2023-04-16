package com.syboks.vehicle.search.example.dao;

import com.syboks.vehicle.search.example.entity.ManufactureYear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufactureYearDAO extends JpaRepository<ManufactureYear, Integer> {
}
