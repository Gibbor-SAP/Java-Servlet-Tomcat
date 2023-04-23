package com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	
	private Integer Id;
	private String nombre;
	private Date fechaAbertura = new Date(); //inicializar fecha con la actual
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaAbertura() {
		return fechaAbertura;
	}
	public void setFechaAbertura(Date fechaAbertura) {
		this.fechaAbertura = fechaAbertura;
	}
}
