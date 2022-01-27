package com.rish.sfgPetClinic.services;

import java.util.Set;

import com.rish.sfgPetClinic.model.Vet;

public interface VetService {

	Vet findById(Long Id);
	
	Set<Vet> findAll();
	
	Vet save(Vet vet);
}
