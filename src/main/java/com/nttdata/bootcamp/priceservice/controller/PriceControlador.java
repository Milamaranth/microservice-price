package com.nttdata.bootcamp.priceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.priceservice.dto.Price;
import com.nttdata.bootcamp.priceservice.service.PriceServiceI;

@RestController
public class PriceControlador {
    @Autowired
    private PriceServiceI priceService;

    @GetMapping("/get-price/{id}")
    public Price getPrice(@PathVariable Integer id) {
        return priceService.getPrecio(id);
    }

    @GetMapping("/get-all-prices")
    public List<Price> getAllPrices() {
        return priceService.getAllPrices();
    }
}
