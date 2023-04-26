<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="${ linkEntradaServlet }" method="post">

		Link: <input type="text" name="nombre" /> 
		Contraseña: <input type="password" name="contrasena" /> 
		
		<input type="hidden" name="accion" value="Login" /> 
		<input type="submit">
	</form>
</body>
</html>