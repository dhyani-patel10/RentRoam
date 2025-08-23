package com.RentRoam.RentRoam.Repository;
import com.RentRoam.RentRoam.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
