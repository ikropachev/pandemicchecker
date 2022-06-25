package org.ikropachev.pandemicchecker.repository;

import org.ikropachev.pandemicchecker.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface CrudPatientRepository extends JpaRepository<Patient, Integer> {
}
