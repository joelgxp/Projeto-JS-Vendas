package com.devj.jsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devj.jsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}