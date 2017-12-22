package com.doisde.hh.integration.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.doisde.hh.integration.domain.User;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
