package com.customer.model.service;

public class CustomerNotFoundException extends RuntimeException {
  public CustomerNotFoundException(String message){
	  super(message);
  }
  
}
