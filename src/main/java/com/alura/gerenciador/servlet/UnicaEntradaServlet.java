package com.alura.gerenciador.servlet;

import java.io.IOException;

import com.alura.gerenciador.accion.Accion;

/*
import com.alura.gerenciador.accion.EliminarEmpresas;
import com.alura.gerenciador.accion.ListaEmpresas;
import com.alura.gerenciador.accion.ModificarEmpresas;
import com.alura.gerenciador.accion.MostrarEmpresas;
import com.alura.gerenciador.accion.NuevaEmpresaForm;
import com.alura.gerenciador.accion.NuevaEmpresas;*/

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAccion = request.getParameter("accion");
		
		String nombreDeClase = "com.alura.gerenciador.accion." + paramAccion;
		String nombre;
		
		try {
			Class clase = Class.forName(nombreDeClase);
			Accion accion = (Accion) clase.newInstance();;
			nombre = accion.ejecutar(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}
		
		String[] tipoYDireccion = nombre.split(":");
		
		if (tipoYDireccion[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/ " + tipoYDireccion[1]);
			rd.forward(request, response);
		}else { 
			response.sendRedirect(tipoYDireccion[1]);
		}
		
		/*
		 * if (paramAccion.equals("ListaEmpresas")) { ListaEmpresas accion = new
		 * ListaEmpresas(); // Instancia para enviar request a ListaEmpresa nombre =
		 * accion.ejecutar(request, response); } else if
		 * (paramAccion.equals("MostrarEmpresa")) { MostrarEmpresas accion = new
		 * MostrarEmpresas(); nombre = accion.ejecutar(request, response); } else if
		 * (paramAccion.equals("EliminarEmpresa")) {
		 * System.out.println("Eliminando Empresa"); EliminarEmpresas accion = new
		 * EliminarEmpresas(); nombre = accion.ejecutar(request, response); } else if
		 * (paramAccion.equals("ModificarEmpresa")) {
		 * System.out.println("Modificando Empresa"); ModificarEmpresas accion = new
		 * ModificarEmpresas(); nombre = accion.ejecutar(request, response); } else if
		 * (paramAccion.equals("NuevaEmpresas")) { System.out.println("Nueva Empresa");
		 * NuevaEmpresas accion = new NuevaEmpresas(); nombre = accion.ejecutar(request,
		 * response); } else if (paramAccion.equals("NuevaEmpresaForm")) {
		 * System.out.println("Nueva Empresa"); NuevaEmpresaForm accion = new
		 * NuevaEmpresaForm(); nombre = accion.ejecutar(request, response); }
		 */
		
	}

}
