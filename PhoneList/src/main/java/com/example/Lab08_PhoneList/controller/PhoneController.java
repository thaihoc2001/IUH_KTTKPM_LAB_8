package com.example.Lab08_PhoneList.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Lab08_PhoneList.entity.Phone;

@RestController
@RequestMapping("/phone")
public class PhoneController {
	@GetMapping("/phones")
	public ResponseEntity<List<Phone>> getAllPhone(){
		List<Phone> phones = new ArrayList<>();
		phones.add(new Phone("iPhone 11", "128GB"));
		phones.add(new Phone("Redmi 8", "64GB"));
		return ResponseEntity.ok().body(phones);
	}
}
