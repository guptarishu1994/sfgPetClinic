package com.rish.sfgPetClinic.services;

import java.util.Set;

import com.rish.sfgPetClinic.model.Owner;

public interface OwnerService extends CRUDService<Owner,Long> {
	
	Owner findByLastName(String lastName);
	

}
