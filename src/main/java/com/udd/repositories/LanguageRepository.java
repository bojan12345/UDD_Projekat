package com.udd.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udd.entities.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Integer> {

}
