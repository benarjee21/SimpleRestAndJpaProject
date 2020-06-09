package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Beans.User;

@RestController
public class UserController {
	
	@Autowired
	com.example.demo.Services.UserDaoService userDaoService;
	
	@GetMapping("/sayHello")
	public String helloVikky() {
		return "Hi Vikky!!!!";
	}
	
	@GetMapping("/users")
	public List<User> allUsers(){
		return userDaoService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> userById(@PathVariable Long id){
		return userDaoService.findById(id);
	}
	

}
