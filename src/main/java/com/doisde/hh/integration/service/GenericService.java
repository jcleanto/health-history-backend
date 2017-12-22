package com.doisde.hh.integration.service;

import java.util.List;

import com.doisde.hh.integration.domain.RandomCity;
import com.doisde.hh.integration.domain.User;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
