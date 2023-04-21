package com.alura.gerenciador.servlet;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//hola
@WebServlet(urlPatterns = "/hola") //este comando sirve para cambiar la url de la página (mapeamiento)
public class HolaMundoServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter(); //Objeto para imprimir los datos que queremos que la página muestre
		out.println("<html>");
		out.println("<body>");
		out.println("Hola! felicitaciones por crear tu primer Servlet");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Ejecutando Servlet sin problemas");
		
	}
	
}
