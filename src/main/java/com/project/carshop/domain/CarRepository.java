package com.project.carshop.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car,Long> {
	
	//fetch cars by brand
	
	List<Car> findByBrand(String brand);

}
