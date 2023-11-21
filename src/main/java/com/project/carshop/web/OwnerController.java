package com.project.carshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.carshop.domain.Owner;
import com.project.carshop.domain.OwnerRepository;


@RestController
public class OwnerController {
	
    @Autowired
    private OwnerRepository repository;
	
//  Add new owner
	@PostMapping("owners")
	Owner newOwner(@RequestBody Owner newOwner) {
		return repository.save(newOwner);
	}

}
