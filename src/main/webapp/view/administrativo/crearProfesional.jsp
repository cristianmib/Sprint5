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
   <title>crearProfesional</title>
</head>

<body>
	
	<%@ include file="menuAdministrativo.jsp"%>
	
	<br>
	
	<h1>Crear profesional</h1>
	
	<br>

	<form action="${pageContext.request.contextPath}/CrearProfesional" method="post" class="form col-6">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Nombre de usuario</label>
			<input type="text" class="form-control" id="exampleInputEmail1" name="nombreUsuario" aria-describedby="emailHelp">
			<div id="emailHelp" class="form-text"></div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Fecha de nacimiento</label>
			<input type="date" class="form-control" id="exampleInputEmail1" name="fechaNacimiento" aria-describedby="emailHelp">
			<div id="emailHelp" class="form-text"></div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">RUN</label>
			<input type="number" class="form-control" id="exampleInputEmail1" name="run" aria-describedby="emailHelp">
			<div id="emailHelp" class="form-text-color=white">Ingrese RUN sin puntos, ni guión, ni dígito verificador.</div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Contraseña</label>
			<input type="text" class="form-control" id="exampleInputEmail1" name="clave" aria-describedby="emailHelp">
			<div id="emailHelp" class="form-text"></div>
		</div>		
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Título</label>
			<input type="text" class="form-control" id="exampleInputPassword1" name="titulo">
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Fecha de ingreso</label>
			<input type="date" class="form-control" id="exampleInputPassword1" name="fechaIngreso">
		</div>
		
		<button type="submit" class="btn btn-primary">Crear usuario</button>
	</form>

	<!-- JavaScript Bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>   
</body>

</html>
