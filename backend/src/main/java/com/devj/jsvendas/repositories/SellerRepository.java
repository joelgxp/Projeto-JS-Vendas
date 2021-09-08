package com.devj.jsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devj.jsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
