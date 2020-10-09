package ru.avokzal63.CatridgeManager.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class PrinterModel {
    @Id
    @GeneratedValue
    private long id;
//    private Vendor vendor;
    private String name;

}

