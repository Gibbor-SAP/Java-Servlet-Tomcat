package com.alura.gerenciador.accion;

import java.io.IOException;
import java.util.List;
import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MostrarEmpresas {

	public void ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		System.out.println("Listando Empresas" + id);

		DB db = new DB();
		Empresa emp = db.buscarEmpresaPorId(id);

		System.out.println(emp.getNombre());

		request.setAttribute("empresas", emp);

		RequestDispatcher rd = request.getRequestDispatcher("/formModificarEmpresa.jsp");
		rd.forward(request, response);

	}

}
