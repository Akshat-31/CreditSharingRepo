package com.example.Credit.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Credit.Service.UserService;
import com.example.Credit.model.CreditCard;
import com.example.Credit.model.Offer;
import com.example.Credit.model.User;

@Controller
public class ProjectController {

	@Autowired
	UserService userSerive;
	
	
	@GetMapping("/home")
	public String getHome() {
		return "It's Working";
	}
	
	@GetMapping("/getUserById")
	public User getUserById(@RequestParam("id") long id) {
		return userSerive.fetchUserFromId(id);
	}
	
	@GetMapping("/getUsers")
	public List<User> getAllUsers() {
		return userSerive.fetchAllUser();
	}
	
	@PostMapping("/addUser")
	public boolean addUser(@RequestBody User user) {
		return userSerive.addUser(user);
	}
	
	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestParam long id) {
		userSerive.removeUserById(id);
	}
	
	@GetMapping("/getAllOffers")
	public List<Offer> getAllOffers() {
		return userSerive.fetchAllOffers();
	}
	
	@GetMapping("/getAllCreditCards")
	public List<CreditCard> getAllCreditCards() {
		return userSerive.fetchAllCreditCards();
	}
}
