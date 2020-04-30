package com.uca.tareaClase11.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	@Pattern(regexp="[0-9]{12}", message="El campo codigo deben ser de 12 digitos")
	private String codigo;
	@Size(min=1, max=100, message="El campo nombre debe tener una longitud entre 1 y 100 caracteres")
	private String nombre;
	@Size(min=1, max=100, message="El campo marca debe tener una longitud entre 1 y 100 caracteres")
	private String marca;
	@Size(min=1, max=500, message="El campo descripcion debe tener una longitud entre 1 y 500 caracteres")
	private String descripcion;
	@Digits(integer = 100, fraction=0, message="No se permiten decimales")
	private String existencias;
	@Pattern(regexp="(((([0-2][0-9])|3[0-1])(/|-)((01|03|05|07|08|10|12)|(1|3|5|7|8|10|12)))|((([0-1][0-9])|2[0-8])(/|-)(02|2))|((([0-2][0-9])|30)(/|-)((04|06|09|11)|(4|6|9|11))))(/|-)([0-12]{4})", 
			message="La fecha ingresada debe seguir el formato dd/mm/yyyy")
	private String fechaDeIngreso;
	
	public Product() {}

	public Product(String codigo, String nombre, String marca, String descripcion, String existencias,
			String fechaDeIngreso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.existencias = existencias;
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
}
