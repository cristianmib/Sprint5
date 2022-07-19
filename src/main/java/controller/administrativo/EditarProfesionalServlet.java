package controller.administrativo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entity.Profesional;
import model.service.AdministrativoService;
import model.service.AdministrativoServiceImpl;
import model.service.ClienteService;
import model.service.ClienteServiceImpl;
import model.service.ProfesionalService;
import model.service.ProfesionalServiceImpl;

@WebServlet("/EditarProfesional")
public class EditarProfesionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdministrativoService service = new AdministrativoServiceImpl();
	private ClienteService service1 = new ClienteServiceImpl();
	private ProfesionalService service2 = new ProfesionalServiceImpl();

    public EditarProfesionalServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idProfesional = request.getParameter("idProfesional");
		request.setAttribute("profesional", service2.read(Integer.parseInt(idProfesional)));		
		
		getServletContext().getRequestDispatcher("/view/administrativo/editarProfesional.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Profesional profesional;
		
		profesional = service2.read(Integer.parseInt(request.getParameter("idProfesional")));
			
		profesional.setNombreUsuario(request.getParameter("nombreUsuario"));
		profesional.setFechaNacimiento(request.getParameter("fechaNacimiento"));
		profesional.setRun(Integer.parseInt(request.getParameter("run")));
		profesional.setClave(request.getParameter("clave"));
		profesional.setTitulo(request.getParameter("titulo"));
		profesional.setFechaIngreso(request.getParameter("fechaIngreso"));
			
		service2.update(profesional);

		request.setAttribute("administrativos", service.read());
		request.setAttribute("clientes", service1.read());
		request.setAttribute("profesionales", service2.read());
		
		getServletContext().getRequestDispatcher("/view/administrativo/listarUsuarios.jsp").forward(request, response);
		
		doGet(request, response);
		
	}

}
