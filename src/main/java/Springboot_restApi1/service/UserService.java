package Springboot_restApi1.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Springboot_restApi1.models.User;
import Springboot_restApi1.repository.UserRepository;

 

@Service
public  class UserService {
	
	
	 @Autowired
     private UserRepository userRepository;
	
	 private static List<User> list = new ArrayList<>();
    
//	 static
//	 {
//		 Date currentDate = new Date();
//		 list.add(new User(12,"saurabh","saurabhsingh","saurabh@email.com",currentDate, currentDate));
//		 
//		 list.add(new User(24,"golla","govindgolla","govind@email.com",currentDate, currentDate));
//	 }
	 
	 
	 
	     
	     
	     // to get all users
	     public List<User> getUsers() {
	         return userRepository.findAll();
	     }
	     
	     // to get a single user by id
	     public User getUserById(int id) {
	         return userRepository.findById(id).orElse(null);
	     }
	     
	     // add a user
	     public void addUser(User user) {
	         try {
	             userRepository.save(user);
	         } catch (Exception e) {
	             throw new RuntimeException("Failed to add user", e);
	         }
	     }
	     
	     // delete a user by id
	     public void deleteUser(int userId) {
	         try {
	             userRepository.deleteById(userId);
	         } catch (Exception e) {
	             throw new RuntimeException("Failed to delete user", e);
	         }
	     }
	     
	     // update a user
	     public void updateUser(User user, int userId) {
	         try {
	             User existingUser = userRepository.findById(userId).orElse(null);
	             if (existingUser == null) {
	                 throw new RuntimeException("User not found");
	             }
	             existingUser.setUsername(user.getUsername());
	             existingUser.setEmail(user.getEmail());
	             userRepository.save(existingUser);
	         } catch (Exception e) {
	             throw new RuntimeException("Failed to update user", e);
	         }
	     }
	 }

