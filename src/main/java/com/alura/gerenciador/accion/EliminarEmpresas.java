package com.alura.gerenciador.accion;

import java.io.IOException;
import java.util.List;
import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EliminarEmpresas {
	
	public void ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Eliminando Empresas" + id);
		
		DB db = new DB();
		db.eliminarEmpresa(id);
		
		response.sendRedirect("entrada?accion=ListaEmpresas");
		
	}

}
