package com.elitech.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.dto.UserDto;
import com.elitech.dto.clients.UserClient;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
 private final UserClient userClient;
 @GetMapping("/{userId}")
 public String createOrder(@PathVariable Long userId) {
 UserDto user = userClient.getUserById(userId);
 return "Order created for user: " + user.getName() + " (" + 
user.getEmail() + ")";
 }
 @GetMapping
 public String welcome()
 {
	 return "welcome to orders request please select user from the other MS";
	 
 }
}