package com.recursoshumano.payroll.entities;

import java.io.Serializable;

public class Worker implements Serializable {
 
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double rendaDiaria;
	
	public Worker() {
		
	}
	
	public Worker(Long id, String name, Double rendaDiaria) {
		
		this.id = id;
		this.name = name;
		this.rendaDiaria = rendaDiaria;
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
	public Double getRendaDiaria() {
		return rendaDiaria;
	}
	public void setRendaDiaria(Double rendaDiaria) {
		this.rendaDiaria = rendaDiaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
