package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) // service permite recibir un post o un get.
			throws ServletException, IOException {

		DB baseDeDatos = new DB();
		List<Empresa> listaEmpresas = baseDeDatos.getEmpresas();
		
		request.setAttribute("empresas", listaEmpresas);
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(request, response);
	}

}
