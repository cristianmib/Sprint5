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
   <title>crearCapacitacion</title>
</head>

<body>
	
	<%@ include file="menuCliente.jsp"%>
	
	<br>
	
	<h1>Crear capacitación</h1>
	
	<br>

	<form action="${pageContext.request.contextPath}/CrearCapacitacion" method="post" class="form col-6">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">RUT cliente</label>
			<input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="rutCliente">
			<div id="emailHelp" class="form-text-color=white">Ingrese RUN sin puntos, ni guión, ni dígito verificador.</div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Día de semana</label> <select class="form-select" aria-label="Default select example" name="diaSemana">
				<option value="">Seleccione el día de semana</option>
				<option value="lunes">lunes</option>
				<option value="martes">martes</option>
				<option value="miercoles">miércoles</option>
				<option value="jueves">jueves</option>
				<option value="viernes">viernes</option>
				<option value="sabado">sábado</option>
				<option value="domingo">domingo</option>
			</select>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Hora</label>
			<input type="time" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="hora">
			<div id="emailHelp" class="form-text-color=white"></div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Lugar</label>
			<input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="lugar">
			<div id="emailHelp" class="form-text"></div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Duración</label>
			<input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="duracion">
			<div id="emailHelp" class="form-text"></div>
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Cantidad de asistentes</label>
			<input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="cantidadAsistentes">
			<div id="emailHelp" class="form-text"></div>
		</div>
		
		<button type="submit" class="btn btn-primary">Crear capacitación</button>
	</form>

	<!-- JavaScript Bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>   
</body>

</html>
