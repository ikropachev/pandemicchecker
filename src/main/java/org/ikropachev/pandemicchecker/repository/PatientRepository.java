package org.ikropachev.pandemicchecker.repository;

import org.ikropachev.pandemicchecker.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientRepository {
    private final CrudPatientRepository crudRestaurantRepository;

    public PatientRepository(CrudPatientRepository crudRestaurantRepository) {
        this.crudRestaurantRepository = crudRestaurantRepository;
    }

    public List<Patient> getAll() {
        return crudRestaurantRepository.findAll();
    }
}
