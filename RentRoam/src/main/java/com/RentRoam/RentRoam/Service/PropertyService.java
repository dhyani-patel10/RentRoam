package com.RentRoam.RentRoam.Service;
import com.RentRoam.RentRoam.Entity.Property;
import com.RentRoam.RentRoam.Entity.User;
import com.RentRoam.RentRoam.Repository.PropertyRepository;
import com.RentRoam.RentRoam.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private UserRepository userRepository;

    public Property createProperty(Property property , Long userId) {
        User owner = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        property.setOwner(owner);
        return propertyRepository.save(property);
    }

    // get property by user id
    public Property getPropertyById(Long id){
        return propertyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Property not found"));

    }
    public List<Property> getAllProperties(){
        return propertyRepository.findAll();
    }
}
