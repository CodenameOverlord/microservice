package com.lcwd.user.hotelService.hotelService.services.impl;

import com.lcwd.user.hotelService.hotelService.entities.Hotel;
import com.lcwd.user.hotelService.hotelService.exceptions.ResourceNotFoundException;
import com.lcwd.user.hotelService.hotelService.repositories.HotelRepository;
import com.lcwd.user.hotelService.hotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel createHotel(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        List<Hotel> allHotels = hotelRepository.findAll();
        return allHotels;
    }


    @Override
    public Hotel getSingleHotel(String hotelId) {
        Hotel hotel = hotelRepository.
                findById(hotelId).
                orElseThrow(()->new ResourceNotFoundException("Hotel with id is not found"));
        return hotel;
    }
}
