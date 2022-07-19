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
   <title>inicio</title>
</head>

<body>	
	
	<%@ include file="menu.jsp"%>		
	
	<br>	
	
	<h1>Inicio</h1>
	
	<br>

<section>
	<p>En la última década han aumentado los índices de
		accidentabilidad, especialmente en las empresas del rubro industrial,
		minero y construcción. Las cifras son alarmantes, a pesar de las leyes
		y normativas que obligan a las empresas a tomar todas las medidas
		necesarias para proteger la vida y salud de los trabajadores.</p>

	<p>Para dar cumplimiento a la normativa y mantener ambientes de
		trabajo seguros, muchas empresas se ven en la obligación de contratar
		asesoría profesional, lo cual representa un costo elevado y fomenta la
		disminución o la no implementación de medidas necesarias para la
		seguridad.</p>

	<p>Muchas de las empresas que han optado por no invertir en
		asesoría preventiva, se ven expuestas a aplicación de multas de las
		entidades fiscalizadoras, gastos por días perdidos en
		accidentabilidad, bajas en la producción, alzas en el pago de
		cotizaciones (al organismo administrador del seguro de accidentes del
		trabajo, ley 16.744), entre otros. Además, hay que considerar posibles
		demandas y pagos de indemnizaciones a los trabajadores y familiares
		afectados por accidentes del trabajo.</p>
</section>

	<!-- JavaScript Bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>   
</body>

</html>
