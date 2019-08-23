package io.javabrains.springbootstarter.carparts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.carparts.CarParts;


@RestController
public class CarPartsController {
	
	@Autowired
	private CarPartsService carPartsService;
	
	
	@RequestMapping("/parts")
	public List<CarParts> getAllParts() {
		return carPartsService.getAllParts();
	}
	
	@RequestMapping("/parts/{id}")
	public CarParts getParts(@PathVariable int id) {
		return carPartsService.getPart(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/parts")
	public void addPart(@RequestBody CarParts parts) {
		carPartsService.addPart(parts);
		
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/parts/{id}")
	public void updatePart(@RequestBody CarParts parts, @PathVariable int id) {
		carPartsService.updatePart(id, parts);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/parts/{id}")
	public void deletePart(@PathVariable int id) {
		carPartsService.deletePart(id);
		
	}
	
	

}
