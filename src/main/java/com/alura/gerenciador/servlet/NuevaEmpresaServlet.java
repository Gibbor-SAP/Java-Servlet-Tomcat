package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NuevaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Nueva empresa registrada");
		
		String nombreEmpresa = request.getParameter("nombre");
		String paramFechaAbertura = request.getParameter("fecha");
		
		Date fechaAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy"); //Parsear la fecha de Date a String con el parámetro pattern de listaEmpresa
			fechaAbertura = sdf.parse(paramFechaAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}		
		
		Empresa empresa = new Empresa();
		empresa.setNombre(nombreEmpresa);
		empresa.setFechaAbertura(fechaAbertura);
		
		DB baseDeDatos = new DB();
		baseDeDatos.agregarEmpresa(empresa);
		
	// Llamar a la  JSP
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas"); //Dirigir al archivo JSP 
		request.setAttribute("empresa", empresa.getNombre()); //Agregamos el atributo empresa que será buscado en la JSP con el mismo nombre
		rd.forward(request, response);
	}
}