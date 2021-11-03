package com.grpduh.budget.repo;

import com.grpduh.budget.entity.Information;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepo extends JpaRepository<Information, Long> {
    Information findById(int id);
}