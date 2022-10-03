package com.nttdata.bootcamp.priceservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.priceservice.dto.Price;
import com.nttdata.bootcamp.priceservice.repository.PriceRepository;

import java.util.List;

@Service
public class PriceService implements PriceServiceI {
    @Autowired
    private PriceRepository priceRepository;

    @Override
    public Price getPrecio(Integer id) {
        return priceRepository.findById(id).orElseThrow();
    }

    @Override
    public Price addPrice(Price price) {
        return priceRepository.save(price);
    }

    @Override
    public List<Price> getAllPrices() {
        return priceRepository.findAll();
    }    
}
