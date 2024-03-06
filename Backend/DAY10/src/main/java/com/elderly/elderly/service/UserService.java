package com.elderly.elderly.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elderly.elderly.entity.Users;
import com.elderly.elderly.repository.UserRepo;



@Service
public class UserService {
    @Autowired
    UserRepo ur;
     
     
     @SuppressWarnings("null")
     public boolean AddUser(Users ue)
     {
          ur.save(ue);
          return true;
     }
     public List<Users> getUser()
     {
          return ur.findAll();
     }
     @SuppressWarnings("null")
     public Optional<Users> getById(Long id)
     {
    	 return ur.findById(id);
     }
}