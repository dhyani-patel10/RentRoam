package com.RentRoam.RentRoam.Repository;
import com.RentRoam.RentRoam.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
}



