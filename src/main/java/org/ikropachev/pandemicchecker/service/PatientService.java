package org.ikropachev.pandemicchecker.service;

import org.ikropachev.pandemicchecker.model.Patient;
import org.ikropachev.pandemicchecker.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> getAll() {
        return repository.getAll();
    }
}
