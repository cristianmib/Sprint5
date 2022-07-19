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
	<script src="https://kit.fontawesome.com/81a2ed02b0.js" crossorigin="anonymous"></script>
   <title>listarUsuarios</title>
</head>

<body>
	
	<%@ include file="menuAdministrativo.jsp"%>
	
	<br>
	
	<h1>Listado de usuarios</h1>
	
	<br>

	<table class="table table-bordered table-dark" id="usuarios">
		<thead>
			<tr>
				<th>Nombre de usuario</th>
				<th>Fecha de nacimiento</th>
				<th>RUN</th>
				<th>Clave</th>
				<th>Perfil</th>
				<th>Editar</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach var="a" items="${administrativos}">
				<tr>
					<td><c:out value="${a.getNombreUsuario()}"></c:out></td>
					<td><c:out value="${a.getFechaNacimiento()}"></c:out></td>
					<td><c:out value="${a.getRun()}"></c:out></td>
					<td><c:out value="${a.getClave()}"></c:out></td>
					<td><c:out value="${a.getPerfil()}"></c:out></td>					
					
					<td>
						<a href="${pageContext.request.contextPath}/EditarAdministrativo?idAdministrativo=${a.getIdAdministrativo()}">
							<i class="fa-solid fa-pen-to-square"></i>
						</a>
					</td>

				</tr>
			</c:forEach>
			
			<c:forEach var="cl" items="${clientes}">
				<tr>
					<td><c:out value="${cl.getNombreUsuario()}"></c:out></td>
					<td><c:out value="${cl.getFechaNacimiento()}"></c:out></td>
					<td><c:out value="${cl.getRun()}"></c:out></td>
					<td><c:out value="${cl.getClave()}"></c:out></td>
					<td><c:out value="${cl.getPerfil()}"></c:out></td>
					
					<td>
						<a href="${pageContext.request.contextPath}/EditarCliente?idCliente=${cl.getIdCliente()}">
							<i class="fa-solid fa-pen-to-square"></i>
						</a>
					</td>
					
				</tr>
			</c:forEach>
			
			<c:forEach var="p" items="${profesionales}">
				<tr>
					<td><c:out value="${p.getNombreUsuario()}"></c:out></td>
					<td><c:out value="${p.getFechaNacimiento()}"></c:out></td>
					<td><c:out value="${p.getRun()}"></c:out></td>
					<td><c:out value="${p.getClave()}"></c:out></td>
					<td><c:out value="${p.getPerfil()}"></c:out></td>
					
					<td>
						<a href="${pageContext.request.contextPath}/EditarProfesional?idProfesional=${p.getIdProfesional()}">
							<i class="fa-solid fa-pen-to-square"></i>
						</a>
					</td>
					
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	
	<!-- JavaScript Bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>   
</body>

</html>
