package com.grpduh.budget.repo;

import com.grpduh.budget.entity.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends JpaRepository<Data, Long> {
}