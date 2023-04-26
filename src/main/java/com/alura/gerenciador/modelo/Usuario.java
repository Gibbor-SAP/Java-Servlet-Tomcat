package com.alura.gerenciador.modelo;

public class Usuario {

	private String login;
	private String contrasena;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	//Comprobar si los datos ingresados son correctos
	
	public boolean esIgual(String login, String contrasena) {
		if (!this.login.equals(login)) { // Si el usuario es distinto entonces falso
			return false;
		}
		if(!this.contrasena.equals(contrasena)) { //Si la contrase�a es distinta entonces falso
			return false;
		}		
		return true; // Sino true
	}
}
