package com.pauline.TP3.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormulaireRepository extends CrudRepository<Formulaire, Long> {
}
