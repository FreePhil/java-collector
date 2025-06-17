package com.henge.collector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class HelloWorldRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        var cars = List.of(
            new Car("sedan", "bmw", "530", 1998),
            new Car("suv", "toyota", "rav4", 2494),
            new Car("hatchback", "honda", "civic", 1498),
            new Car("coupe", "ford", "mustang", 5038),
            new Car("sedan", "mercedes", "c-class", 1991),
            new Car("suv", "jeep", "wrangler", 3604),
            new Car("sedan", "audi", "a4", 1984),
            new Car("pickup", "chevrolet", "silverado", 5328),
            new Car("crossover", "mazda", "cx5", 2488),
            new Car("hatchback", "volkswagen", "golf", 1984),
            new Car("sedan", "lexus", "es", 3456)
        );

        var sedanCars = cars.stream().filter(car -> car.getType() == "sedan").toList();
        log.info("cars: {}", sedanCars);
    }
}