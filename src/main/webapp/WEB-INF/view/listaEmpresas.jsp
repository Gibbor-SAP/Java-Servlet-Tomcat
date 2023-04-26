<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.alura.gerenciador.modelo.Empresa, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Gerenciador</title>
</head>
<body>

	<c:if test="${not empty empresa}">
		Empresa ${empresa} registrada! <br/>
	</c:if>
	
	<h5>Lista de Empresas</h5> <br/>
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">										
			<li>
				${empresa.nombre} - <fmt:formatDate value="${empresa.fechaAbertura }" pattern="dd/MM/yyy"/>
				<a href="/gerenciador/entrada?accion=MostrarEmpresa&id=${empresa.id}">Modificar</a>
				<a href="/gerenciador/entrada?accion=EliminarEmpresa&id=${empresa.id}">Eliminar</a> <!-- Método eliminar por Id -->
			</li>		
		</c:forEach>
	
	</ul>

</body>
</html>