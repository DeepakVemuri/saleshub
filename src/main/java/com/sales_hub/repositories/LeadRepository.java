package com.sales_hub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales_hub.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
