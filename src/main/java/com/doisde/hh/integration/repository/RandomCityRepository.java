package com.doisde.hh.integration.repository;

import org.springframework.data.repository.CrudRepository;

import com.doisde.hh.integration.domain.RandomCity;

/**
 * Created by nydiarra on 10/05/17.
 */
public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
