package com.henge.collector;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String type;
    private String make;
    private String model;
    private Integer engineCapacity;
}