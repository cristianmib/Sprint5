<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<!-- Anexa las librerías de la carpeta "lib" -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es">

<head>

	<link rel="icon" href="https://i.postimg.cc/pXQs0jJC/Whats-App-Image-2022-07-19-at-12-34-12-PM.jpg">

   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <!-- CSS Bootstrap -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
	<style>
		<%@include file="/static/css/estilo.css" %>
	</style>
   <title>listarCapacitaciones</title>
</head>

<body>
	
	<%@ include file="menuCliente.jsp"%>
	
	<br>
	
	<h1>Listado de capacitaciones</h1>
	
	<br>

	<table class="table table-bordered table-dark" id="capacitaciones">
		<thead>
			<tr>
				<th>Id de capacitación</th>
				<th>RUT Cliente</th>
				<th>Día</th>
				<th>Hora</th>
				<th>Lugar</th>
				<th>Duración</th>
				<th>Cantidad de asistentes</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach var="c" items="${capacitaciones}">
				<tr>
					<td><c:out value="${c.getIdCapacitacion()}"></c:out></td>
					<td><c:out value="${c.getRutCliente()}"></c:out></td>
					<td><c:out value="${c.getDiaSemana()}"></c:out></td>
					<td><c:out value="${c.getHora()}"></c:out></td>
					<td><c:out value="${c.getLugar()}"></c:out></td>
					<td><c:out value="${c.getDuracion()}"></c:out></td>
					<td><c:out value="${c.getCantidadAsistentes()}"></c:out></td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	
	<!-- JavaScript Bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>   
</body>

</html>
