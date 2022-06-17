package com.sales_hub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales_hub.entities.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
