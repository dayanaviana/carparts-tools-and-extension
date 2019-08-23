package io.javabrains.springbootstarter.carparts;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.springbootstarter.carparts.CarParts;

public interface TopicRepository extends CrudRepository<CarParts, Integer> {
	
	

}
