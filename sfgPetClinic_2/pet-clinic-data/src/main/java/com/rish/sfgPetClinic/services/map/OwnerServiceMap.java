package com.rish.sfgPetClinic.services.map;

import java.util.Set;

import com.rish.sfgPetClinic.model.Owner;
import com.rish.sfgPetClinic.services.CRUDService;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CRUDService<Owner,Long>{

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}


	@Override 
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	

}
