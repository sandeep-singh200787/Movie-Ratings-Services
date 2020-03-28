package com.movierate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movierate.dto.Rating;
import com.movierate.dto.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingConttroller {
	
	@GetMapping("/rate/{id}")
	public Rating getRate(@PathVariable("id") String id) {
		return new Rating(id, 4);
	}
	
	@GetMapping("/user/{userName}")
	private UserRating getUserRating(@PathVariable("userName") String name) {
		return new UserRating(name, 5);
	}
	
	
	
	

}
