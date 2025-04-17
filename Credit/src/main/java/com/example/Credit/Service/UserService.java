package com.example.Credit.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Credit.Repository.*;
import com.example.Credit.model.CreditCard;
import com.example.Credit.model.Offer;
import com.example.Credit.model.User;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	@Autowired
	CreditCardRepository creditRepo;
	@Autowired
	OfferRepository offerRepo;
	
	public List<User> fetchAllUser(){
		return userRepo.findAll();
	}
	
	public List<CreditCard> fetchAllCreditCards(){
		return creditRepo.findAll();
	}
	
	public List<Offer> fetchAllOffers(){
		return offerRepo.findAll();
	}
	
	public User fetchUserFromId(long id) {
		Optional<User> userList= userRepo.findById(id);
		if(!userList.isEmpty()) {
			return userList.get();
		}
		return null;
	}
	
	public boolean addUser(User user) {
		userRepo.save(user);
		return true;
	}
	
	public void removeUser(User user) {
		userRepo.delete(user);
	}
	
	public void removeUserById(long id) {
		userRepo.deleteById(id);
	}
	
}
