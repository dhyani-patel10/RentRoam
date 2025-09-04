package com.RentRoam.RentRoam.Service;

import com.RentRoam.RentRoam.Entity.User;
import com.RentRoam.RentRoam.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

     public UserService(UserRepository userRepository)
     {
         this.userRepository = userRepository;
     }

     //GetAllUser
     public List<User> getAlluser(){
         return userRepository.findAll();
     }
    //createUser
    public User CreateUser(User user)
    {
        return userRepository.save(user);
    }
    //getUserById
    public Optional<User> getUserById(Long id){
         return userRepository.findById(id);
    }
    //deleteUser
    public void deleteUser(Long id){
          userRepository.deleteById(id);
    }
}
