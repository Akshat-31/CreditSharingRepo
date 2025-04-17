package com.example.Credit.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Credit.model.CreditCard;


public interface CreditCardRepository extends JpaRepository<CreditCard, Long>{
	
	
}
