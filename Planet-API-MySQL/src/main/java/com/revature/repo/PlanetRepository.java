package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Planet;

public interface PlanetRepository extends JpaRepository<Planet, Integer>{

	Planet findByName(String name);
	
//	Planet save(Planet p); This method is already provided as a 'generic' method by JpaRepository
	
}
