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
   <title>editarCliente</title>
</head>

<body>
	
	<%@ include file="menuAdministrativo.jsp"%>
	
	<br>
	
	<h1>Editar cliente</h1>
	
	<br>

	<form action="${pageContext.request.contextPath}/EditarCliente" method="post" class="form col-6">
		
	<input type="hidden" id="idCliente" name="idCliente" value="${cliente.getIdCliente()}">
	
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Nombre de usuario</label>
			<input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="nombreUsuario" value="${cliente.getNombreUsuario()}">
			<div id="emailHelp" class="form-text"></div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Fecha de nacimiento</label>
			<input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="fechaNacimiento" value="${cliente.getFechaNacimiento()}">
			<div id="emailHelp" class="form-text"></div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">RUN</label>
			<input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="run" value="${cliente.getRun()}">
			<div id="emailHelp" class="form-text-color=white">Ingrese RUN sin puntos, ni guión, ni dígito verificador.</div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Contraseña</label>
			<input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="clave" value="${cliente.getClave()}">
			<div id="emailHelp" class="form-text"></div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Nombres</label>
			<input type="text" class="form-control" id="exampleInputPassword1" name="nombres" value="${cliente.getNombres()}">
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Apellidos</label>
			<input type="text" class="form-control" id="exampleInputPassword1" name="apellidos" value="${cliente.getApellidos()}">
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Teléfono</label>
			<input type="number" class="form-control" id="exampleInputPassword1" name="telefono" value="${cliente.getTelefono()}">
			<div id="emailHelp" class="form-text-color=white">(9) + 8 dígitos.</div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">AFP</label>
			<input type="text" class="form-control" id="exampleInputPassword1" name="afp" value="${cliente.getAfp()}">
		</div>

		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Sistema de salud</label>
			<select class="form-select" aria-label="Default select example" name="sistemaSalud" value="${cliente.getSistemaSalud()}">
				<option value="">Seleccione sistema de salud</option>
				<option value="1">Fonasa</option>
				<option value="2">Isapre</option>
			</select>			
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Dirección</label>
			<input type="text" class="form-control" id="exampleInputPassword1" name="direccion" value="${cliente.getDireccion()}">
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Comuna</label>
			<input type="text" class="form-control" id="exampleInputPassword1" name="comuna" value="${cliente.getComuna()}">
		</div>

		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Edad</label>
			<input type="text" class="form-control" id="exampleInputPassword1" name="edad" value="${cliente.getEdad()}">
		</div>
		
		<button type="submit" class="btn btn-primary">Guardar cambios</button>
	</form>

	<!-- JavaScript Bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>   
</body>

</html>
