package com.lcwd.user.hotelService.hotelService.services;

import com.lcwd.user.hotelService.hotelService.entities.Hotel;

import java.util.List;

public interface HotelService {
//    create
    Hotel createHotel(Hotel hotel);
//    getAll
    List<Hotel> getAllHotels();
//    getSingle
    Hotel getSingleHotel(String hotelId);
}
