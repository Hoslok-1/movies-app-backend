package com.example.moviesappspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> allUsers(){
        return userRepository.findAll();
    }

    public boolean isEmailAlreadyInUse(String email){
        return userRepository.existsByEmail(email);
    }


 }
