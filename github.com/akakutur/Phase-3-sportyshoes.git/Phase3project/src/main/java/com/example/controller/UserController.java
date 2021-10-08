package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.model.User;
import com.example.repository.UserRepo;

@RestController
@RequestMapping("user")

public class UserController {

  @Autowired
  UserRepo userrepo;
  
	@GetMapping("alluser")
	public List<User> getAllProduct()
	{
		List<User> user=(List<User>) userrepo.findAll(); 
		return user;
	}
	
	@PostMapping("add")
	public User addProduct(@RequestBody User u)
	{
		return userrepo.save(u);
	}
	
	//change password
	@PutMapping("update/{id}")
	public User updateuser(@RequestBody User u)
	{
		return userrepo.save(u);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteUser(@PathVariable int id)
	{
		userrepo.deleteById(id);
	}
		

	

}
