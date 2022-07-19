<img src="https://i.postimg.cc/zG4fbmZy/Whats-App-Image-2022-07-19-at-12-19-52-PM.jpg" alt="" width="200" height="">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="${pageContext.request.contextPath}/Administrativo">Administrativo</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown"
					aria-expanded="false">Crear usuario</a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<li><a class="dropdown-item" href="${pageContext.request.contextPath}/CrearCliente">Cliente</a></li>
						<li><a class="dropdown-item" href="${pageContext.request.contextPath}/CrearProfesional">Profesional</a></li>
						<li><a class="dropdown-item" href="${pageContext.request.contextPath}/CrearAdministrativo">Administrativo</a></li>
					</ul>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/ListarUsuarios">Listar usuarios</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/CerrarSesion">Cerrar sesión</a></li>
				
			</ul>
		</div>
	</div>
</nav>
