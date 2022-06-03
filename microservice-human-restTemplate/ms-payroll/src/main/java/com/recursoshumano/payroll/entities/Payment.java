package com.recursoshumano.payroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Double rendaDiaria;
	private Integer dias;
	
	public Payment() {
		
	}

	public Payment(String name, Double rendaDiária, Integer dias) {
		super();
		this.name = name;
		this.rendaDiaria = rendaDiária;
		this.dias = dias;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaDiária() {
		return rendaDiaria;
	}

	public void setRendaDiária(Double rendaDiária) {
		this.rendaDiaria = rendaDiária;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	public double getTotal() {
		return dias*rendaDiaria;
		}

	}
