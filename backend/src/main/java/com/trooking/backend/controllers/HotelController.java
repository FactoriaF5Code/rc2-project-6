package com.trooking.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trooking.backend.models.Hotel;
import com.trooking.backend.models.HotelRepository;

@RestController
public class HotelController {

    private HotelRepository repository;

    public HotelController(@Autowired HotelRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/hotels") 
    public List<Hotel> allHotels(){
        return repository.findAll();
    }

    
}