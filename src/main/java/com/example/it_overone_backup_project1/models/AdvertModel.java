package com.example.it_overone_backup_project1.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "advert_shop_model")
@Data
public class AdvertModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "price")
    String price;

    @Column(name = "weight")
    String weight;

    @Column(name = "disc")
    String disc;

    @Column(name = "name")
    String name;
}
