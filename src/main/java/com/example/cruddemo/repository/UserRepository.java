package com.example.cruddemo.repository;

import com.example.cruddemo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    /**
     * Return the user having the passed name or null if no user is found.
     *
     * @param name the user name.
     */
    List<User> findByName(String name);
}
