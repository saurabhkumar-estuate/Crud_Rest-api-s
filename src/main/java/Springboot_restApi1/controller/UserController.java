package Springboot_restApi1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Springboot_restApi1.models.User;
import Springboot_restApi1.service.UserService;

 @RestController
 public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/user")
	public List <User> getUser()
	{
		return this.userService.getUsers();
	}
	
	
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") int id)
	{
		 return this.userService.getUserById(id); 
	}
	
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user)
	{
		 this.userService.addUser(user);
		 return user;
		  
	}
	
	
	@DeleteMapping("/user/{userId}")
	public void deleteUser(@PathVariable("userId") int userId)
	{
		this.userService.deleteUser(userId);
	}
	
	
	@PutMapping("/user/{userId}")
	public User updateUser(@RequestBody User user, @PathVariable("userId") int userId)
	{
		this.userService.updateUser(user,userId);
		return user; 
	}

}
