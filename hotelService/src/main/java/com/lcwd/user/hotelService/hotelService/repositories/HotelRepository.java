package com.lcwd.user.hotelService.hotelService.repositories;

import com.lcwd.user.hotelService.hotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {
}
