<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkUnicaEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario empresa</title>
</head>
<body>
	<form action="${ linkUnicaEntradaServlet }" method="post">

		Nombre empresa: <input type="text" name="nombre" /> 
		Fecha Abertura: <input type="text" name="fecha" /> <input type="hidden" name="accion"
			value="NuevaEmpresas" /> <input type="submit">
	</form>
</body>
</html>