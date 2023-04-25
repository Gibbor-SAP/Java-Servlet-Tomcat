package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.alura.gerenciador.accion.EliminarEmpresas;
import com.alura.gerenciador.accion.ListaEmpresas;
import com.alura.gerenciador.accion.ModificarEmpresas;
import com.alura.gerenciador.accion.MostrarEmpresas;
import com.alura.gerenciador.accion.NuevaEmpresas;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAccion = request.getParameter("accion");

		if (paramAccion.equals("ListaEmpresas")) {
			ListaEmpresas accion = new ListaEmpresas(); // Instancia para enviar request a ListaEmpresa
			accion.ejecutar(request, response);
		} else if (paramAccion.equals("MostrarEmpresa")) {
			MostrarEmpresas accion = new MostrarEmpresas();
			accion.ejecutar(request, response);
		} else if (paramAccion.equals("EliminarEmpresa")) {
			System.out.println("Eliminando Empresa");
			EliminarEmpresas accion = new EliminarEmpresas();
			accion.ejecutar(request, response);
		} else if (paramAccion.equals("ModificarEmpresa")) {
			System.out.println("Modificando Empresa");
			ModificarEmpresas accion = new ModificarEmpresas();
			accion.ejecutar(request, response);
		} else if (paramAccion.equals("NuevaEmpresas")) {
			System.out.println("Nueva Empresa");
			NuevaEmpresas accion = new NuevaEmpresas();
			accion.ejecutar(request, response);
		}

	}

}
