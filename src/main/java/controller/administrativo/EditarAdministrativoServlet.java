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

@WebServlet("/EditarAdministrativo")
public class EditarAdministrativoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdministrativoService service = new AdministrativoServiceImpl();
	private ClienteService service1 = new ClienteServiceImpl();
	private ProfesionalService service2 = new ProfesionalServiceImpl();

    public EditarAdministrativoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idAdministrativo = request.getParameter("idAdministrativo");
		request.setAttribute("administrativo", service.read(Integer.parseInt(idAdministrativo)));		
		
		getServletContext().getRequestDispatcher("/view/administrativo/editarAdministrativo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Administrativo administrativo;
		
		administrativo = service.read(Integer.parseInt(request.getParameter("idAdministrativo")));
			
		administrativo.setNombreUsuario(request.getParameter("nombreUsuario"));
		administrativo.setFechaNacimiento(request.getParameter("fechaNacimiento"));
		administrativo.setRun(Integer.parseInt(request.getParameter("run")));
		administrativo.setClave(request.getParameter("clave"));
		administrativo.setArea(request.getParameter("area"));
		administrativo.setExperienciaPrevia(request.getParameter("experienciaPrevia"));
			
		service.update(administrativo);

		request.setAttribute("administrativos", service.read());
		request.setAttribute("clientes", service1.read());
		request.setAttribute("profesionales", service2.read());
		
		getServletContext().getRequestDispatcher("/view/administrativo/listarUsuarios.jsp").forward(request, response);
		
		doGet(request, response);

	}

}
