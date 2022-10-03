package com.nttdata.bootcamp.priceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.bootcamp.priceservice.dto.Price;

public interface PriceRepository extends JpaRepository<Price, Integer> {
}
