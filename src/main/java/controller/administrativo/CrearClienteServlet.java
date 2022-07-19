package controller.administrativo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entity.Cliente;
import model.service.AdministrativoService;
import model.service.AdministrativoServiceImpl;
import model.service.ClienteService;
import model.service.ClienteServiceImpl;
import model.service.ProfesionalService;
import model.service.ProfesionalServiceImpl;

@WebServlet("/CrearCliente")
public class CrearClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	
	private AdministrativoService service = new AdministrativoServiceImpl();
	private ClienteService service1 = new ClienteServiceImpl();
	private ProfesionalService service2 = new ProfesionalServiceImpl();

    public CrearClienteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/view/administrativo/crearCliente.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cliente cliente;
		
		cliente = new Cliente();
		cliente.setNombreUsuario(request.getParameter("nombreUsuario"));
		cliente.setFechaNacimiento(request.getParameter("fechaNacimiento"));
		cliente.setRun(Integer.parseInt(request.getParameter("run")));
		cliente.setClave(request.getParameter("clave"));
		cliente.setPerfil("cliente");
		cliente.setNombres(request.getParameter("nombres"));
		cliente.setApellidos(request.getParameter("apellidos"));
		cliente.setTelefono(Integer.parseInt(request.getParameter("telefono")));
		cliente.setAfp(request.getParameter("afp"));		
		cliente.setSistemaSalud(Integer.parseInt(request.getParameter("sistemaSalud")));
		cliente.setDireccion(request.getParameter("direccion"));
		cliente.setComuna(request.getParameter("comuna"));
		cliente.setEdad(Integer.parseInt(request.getParameter("edad")));
			
		service1.create(cliente);
			
		request.setAttribute("administrativos", service.read());
		request.setAttribute("clientes", service1.read());
		request.setAttribute("profesionales", service2.read());
	
		getServletContext().getRequestDispatcher("/view/administrativo/listarUsuarios.jsp").forward(request, response);
				
		doGet(request, response);
	}

}
