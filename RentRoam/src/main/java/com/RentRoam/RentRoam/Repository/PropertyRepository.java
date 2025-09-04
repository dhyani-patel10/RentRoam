package com.RentRoam.RentRoam.Repository;

import com.RentRoam.RentRoam.Entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PropertyRepository extends JpaRepository<Property,Long>{
}
