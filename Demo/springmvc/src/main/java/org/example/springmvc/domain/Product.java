package org.example.springmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
    private int serialNumber;
    private String productName;
    private double price;
}
