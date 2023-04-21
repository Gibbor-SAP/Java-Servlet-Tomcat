package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

//SIMULACION DE UNA BASE DE DATOS
/*Usamos variables estáticas en la base de datos que va a ser de la clase y no de los objetos, 
entonces todos los objetos van a compartir el mismo atributo.*/

public class DB {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	
//Creamos una lista de empresas predeterminadas para simular empresas ya cargadas.
	static {
		Empresa empresa = new Empresa();
		empresa.setNombre("Alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNombre("Caelum");
		
		DB.listaEmpresas.add(empresa);
		DB.listaEmpresas.add(empresa2);
	}

	public void agregarEmpresa(Empresa empresa) {
		DB.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){ 
		return DB.listaEmpresas;
	}
}
