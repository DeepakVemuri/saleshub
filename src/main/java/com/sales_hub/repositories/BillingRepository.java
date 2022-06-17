package com.sales_hub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales_hub.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
