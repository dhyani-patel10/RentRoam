package com.RentRoam.RentRoam.Service;

import com.RentRoam.RentRoam.Entity.Booking;
import com.RentRoam.RentRoam.Repository.BookingRepository;
import com.RentRoam.RentRoam.Repository.PropertyRepository;
import org.apache.ibatis.annotations.Insert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.ibatis.annotations.Property;
import java.time.LocalDate;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private PropertyRepository propertyRepository;


    public Booking createBooking(Long propertyId, LocalDate starDate,LocalDate endDate) {
        Property property = (Property) propertyRepository.findById(propertyId)
                .orElseThrow(() -> new RuntimeException("property Not Found"));

        Booking booking = new Booking();
        booking.setProperty(property);
        booking.setStartDate(starDate);
        booking.setEndDate(endDate);

        return bookingRepository.save(booking);
    }
         //get all bookings

        public List<Booking>  getAllBookings() {
            return bookingRepository.findAll();
        }



        //get booking by property id
        public List<Booking> getBookingByProperty(Long propertyId){
            return bookingRepository.findByPropertyId(propertyId);
        }


        //delete
        public void deleteBooking (Long id){
             bookingRepository.deleteById(id);

        }

        //get booking by id
        public Booking getBookingsById(Long id){
    return bookingRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Booking not found"));
}

}

