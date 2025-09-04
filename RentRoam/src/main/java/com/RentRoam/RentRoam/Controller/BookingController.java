package com.RentRoam.RentRoam.Controller;

import com.RentRoam.RentRoam.Entity.Booking;
import com.RentRoam.RentRoam.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;


    @PostMapping
    public Booking createBooking(@RequestParam Long propertyId,
                                 @RequestParam LocalDate startDate,
                                 @RequestParam LocalDate endDate){
        return bookingService.createBooking(propertyId, startDate, endDate);
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id){
        return bookingService.getBookingsById(id);
    }


    @GetMapping
    public List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @GetMapping("/property/{propertyId}")
    public List<Booking> getBookingByProperty(@PathVariable Long propertyId){
        return bookingService.getBookingByProperty(propertyId); //%%  getBookingsByProperty
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id){
        bookingService.deleteBooking(id);
    }
}
