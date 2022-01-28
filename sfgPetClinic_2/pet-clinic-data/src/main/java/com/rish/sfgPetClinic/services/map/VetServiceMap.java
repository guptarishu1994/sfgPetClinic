package com.rish.sfgPetClinic.services.map;

import java.util.Set;

import com.rish.sfgPetClinic.model.Vet;
import com.rish.sfgPetClinic.services.CRUDService;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CRUDService<Vet,Long> {

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

}
