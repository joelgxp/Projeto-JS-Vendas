package com.devj.jsvendas.dto;

import java.io.Serializable;

import com.devj.jsvendas.entities.Seller;

public class SaleDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public SaleDTO() {
		
	}

	public SaleDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SaleDTO(Seller entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
