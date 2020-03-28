package com.example.carros.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "NOMEDOMODELO")
	private String nomeDoModelo;
	
	@Column(name = "MARCA")
	private String marca;
	
	@Column(name = "ANOFABRICACAO")
	private LocalDate anoFabricacao;
	
	@Column(name = "CHASSI")
	private String chassi;
	
	public Car () {
		
	}
	
	public Car(long id, String nomeDoModelo, String marca, String anaFabricacao, String chassi) {
		this.id = id;
		this.nomeDoModelo = nomeDoModelo;
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.chassi = chassi;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeDoModelo() {
		return nomeDoModelo;
	}

	public void setNomeDoModelo(String nomeDoModelo) {
		this.nomeDoModelo = nomeDoModelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDate getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(LocalDate anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Car other = (Car) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	

}
