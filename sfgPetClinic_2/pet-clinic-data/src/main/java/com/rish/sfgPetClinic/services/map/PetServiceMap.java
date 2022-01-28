package com.rish.sfgPetClinic.services.map;

import java.util.Set;

import com.rish.sfgPetClinic.model.Owner;
import com.rish.sfgPetClinic.model.Pet;
import com.rish.sfgPetClinic.services.CRUDService;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CRUDService<Pet,Long> {

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

}
