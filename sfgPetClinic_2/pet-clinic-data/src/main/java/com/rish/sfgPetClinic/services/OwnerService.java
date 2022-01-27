package com.rish.sfgPetClinic.services;

import java.util.Set;

import com.rish.sfgPetClinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long Id);
	
	Set<Owner> findAll();
	
	Owner save(Owner owner);

}
