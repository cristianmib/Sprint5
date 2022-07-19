package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entity.Administrativo;
import model.entity.Cliente;
import model.entity.Profesional;
import model.service.AdministrativoService;
import model.service.AdministrativoServiceImpl;
import model.service.ClienteService;
import model.service.ClienteServiceImpl;
import model.service.ProfesionalService;
import model.service.ProfesionalServiceImpl;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdministrativoService service = new AdministrativoServiceImpl();
	private ClienteService service1 = new ClienteServiceImpl();
	private ProfesionalService service2 = new ProfesionalServiceImpl();

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Administrativo administrativo;
		Cliente cliente;
		Profesional profesional;
		
		administrativo = service.readRun(Integer.parseInt(request.getParameter("run")));
		cliente = service1.readRun(Integer.parseInt(request.getParameter("run")));
		profesional = service2.readRun(Integer.parseInt(request.getParameter("run")));
		
		String perfil = request.getParameter("perfil");
		String runTexto = request.getParameter("run");		
		String clave = request.getParameter("clave");
		int run = Integer.parseInt(runTexto);
		
		if (perfil.equals("administrativo")) {
			if (run == administrativo.getRun() && clave.equals(administrativo.getClave())) {
				getServletContext().getRequestDispatcher("/view/administrativo/administrativo.jsp").forward(request, response);
			} else {
				getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
			}			
		}
		else if (perfil.equals("cliente")) {
			if (run == cliente.getRun() && clave.equals(cliente.getClave())) {
				getServletContext().getRequestDispatcher("/view/cliente/cliente.jsp").forward(request, response);
			} else {
				getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
			}
		}
		else if (perfil.equals("profesional")) {
			if (run == profesional.getRun() && clave.equals(profesional.getClave())) {
				getServletContext().getRequestDispatcher("/view/profesional/profesional.jsp").forward(request, response);
			} else {
				getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
			}
		}
		
		doGet(request, response);
	}

}
