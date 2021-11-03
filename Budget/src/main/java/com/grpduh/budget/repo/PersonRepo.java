package com.grpduh.budget.repo;

import com.grpduh.budget.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
    Person findById(int Id);
}