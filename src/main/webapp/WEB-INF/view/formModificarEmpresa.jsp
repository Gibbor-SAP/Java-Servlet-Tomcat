<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario empresa</title>
</head>
<body>
	<form action="${ linkEntradaServlet }" method="post">

		Nombre empresa: <input type="text" name="nombre"
						value="${ empresa.nombre }" /> 
		Fecha Abertura: <input type="text"name="fecha" value="<fmt:formatDate 
					 	value="${empresa.fechaAbertura }" pattern="dd/MM/yyy"/>" />
						<input type="hidden" name="id" value="${ empresa.id }" /><input
						type="hidden" name="accion" value="ModificarEmpresas" /> <input
						type="submit">
	</form>
</body>
</html>