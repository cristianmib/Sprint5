package controller.administrativo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entity.Administrativo;
import model.service.AdministrativoService;
import model.service.AdministrativoServiceImpl;
import model.service.ClienteService;
import model.service.ClienteServiceImpl;
import model.service.ProfesionalService;
import model.service.ProfesionalServiceImpl;

@WebServlet("/CrearAdministrativo")
public class CrearAdministrativoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdministrativoService service = new AdministrativoServiceImpl();
	private ClienteService service1 = new ClienteServiceImpl();
	private ProfesionalService service2 = new ProfesionalServiceImpl();

    public CrearAdministrativoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/view/administrativo/crearAdministrativo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Administrativo administrativo;
		
		administrativo = new Administrativo();
		administrativo.setNombreUsuario(request.getParameter("nombreUsuario"));
		administrativo.setFechaNacimiento(request.getParameter("fechaNacimiento"));
		administrativo.setRun(Integer.parseInt(request.getParameter("run")));
		administrativo.setClave(request.getParameter("clave"));
		administrativo.setPerfil("administrativo");
		administrativo.setArea(request.getParameter("area"));
		administrativo.setExperienciaPrevia(request.getParameter("experienciaPrevia"));
			
		service.create(administrativo);
			
		request.setAttribute("administrativos", service.read());
		request.setAttribute("clientes", service1.read());
		request.setAttribute("profesionales", service2.read());
	
		getServletContext().getRequestDispatcher("/view/administrativo/listarUsuarios.jsp").forward(request, response);
		
		doGet(request, response);
	}

}
