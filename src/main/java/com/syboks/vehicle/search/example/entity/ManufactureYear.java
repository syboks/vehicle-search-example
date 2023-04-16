package com.syboks.vehicle.search.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="manufactur_year")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufactureYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int year;
}
