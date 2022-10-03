package com.nttdata.bootcamp.priceservice.service;

import java.util.List;

import com.nttdata.bootcamp.priceservice.dto.Price;

public interface PriceServiceI {
    Price getPrecio(Integer id);
    Price addPrice(Price price);
    List<Price> getAllPrices();
}
