package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.revature.models.Planet;
import com.revature.service.PlanetService;



@RestController
@RequestMapping("/api")
public class PlanetController {
	//CRUD - Create, Read, Update and Delete resources 
	
	@Autowired
	PlanetService planetService;
	
	@PostMapping("/planet")
	public void createPlanet(@RequestBody Planet incomingPlanet) {
		boolean success = planetService.saveMyPlanet(incomingPlanet);
		
		if(success == false) {
			throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT,"We don't allow Pluto's here!");
		}
	}
	
	@DeleteMapping("/planet")
	public void deletePlanet() {
		
	}
	
	@GetMapping("/planet/{name}")
	public Planet viewPlanetByName(@PathVariable String name) {
		Planet outGoingPlanet = planetService.getPlanetByName(name);
		System.out.println(outGoingPlanet);
		return outGoingPlanet;
	}
	
	@GetMapping("/planets")
	public List<Planet> viewAllPlanets() {
		return planetService.getAllPlanets();
	}
	
	
}
