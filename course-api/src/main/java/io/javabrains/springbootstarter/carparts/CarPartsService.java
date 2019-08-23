package io.javabrains.springbootstarter.carparts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.carparts.CarParts;


@Service
public class CarPartsService {
	
	@Autowired
	private TopicRepository topicRepo;
	
	public List<CarParts> getAllParts(){
		List<CarParts> parts = new ArrayList<>();
		topicRepo.findAll()
		.forEach(parts::add);
		return parts;
	}
	
	public CarParts getPart(int id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepo.findOne(id);
	}

	public void addPart(CarParts parts) {
		topicRepo.save(parts);
		
	}

	public void updatePart(int id, CarParts parts) {
		topicRepo.save(parts);
		}


	public void deletePart(int id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepo.delete(id);
		
	}
}

