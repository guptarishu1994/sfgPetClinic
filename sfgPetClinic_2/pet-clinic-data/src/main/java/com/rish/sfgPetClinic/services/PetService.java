package com.rish.sfgPetClinic.services;

import java.util.Set;

import com.rish.sfgPetClinic.model.Pet;

public interface PetService {
	
	Pet findById(Long Id);
	
	Set<Pet> findAll();
	
	Pet save(Pet pet);
}
