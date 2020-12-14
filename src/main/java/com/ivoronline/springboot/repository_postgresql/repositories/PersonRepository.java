package com.ivoronline.springboot.repository_postgresql.repositories;

import com.ivoronline.springboot.repository_postgresql.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
