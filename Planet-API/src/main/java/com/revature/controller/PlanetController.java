package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Planet;
import com.revature.repo.PlanetRepository;



@RestController
@RequestMapping("/api")
public class PlanetController {
	//CRUD - Create, Read, Update and Delete resources 
	
	@Autowired
	PlanetRepository myGalaxy;
	
	@PostMapping("/planet")
	public void createPlanet(@RequestBody Planet incomingPlanet) {
		myGalaxy.save(incomingPlanet);
	}
	
	@DeleteMapping("/planet")
	public void deletePlanet() {
		
	}
	
	@GetMapping("/planet/{name}")
	public Planet viewPlanetByName(@PathVariable String name) {
		Planet outGoingPlanet = myGalaxy.findByName(name);
		System.out.println(outGoingPlanet);
		return outGoingPlanet;
	}
	
	@GetMapping("/planets")
	public List<Planet> viewAllPlanets() {
		return myGalaxy.findAll();
	}
	
	
}
