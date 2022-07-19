package controller.cliente;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entity.Capacitacion;
import model.service.CapacitacionService;
import model.service.CapacitacionServiceImpl;

@WebServlet("/CrearCapacitacion")
public class CrearCapacitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CapacitacionService service = new CapacitacionServiceImpl();

    public CrearCapacitacionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/view/cliente/crearCapacitacion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Capacitacion capacitacion;
		
		capacitacion = new Capacitacion();
		
		capacitacion.setRutCliente(Integer.parseInt(request.getParameter("rutCliente")));
		capacitacion.setDiaSemana(request.getParameter("diaSemana"));
		capacitacion.setHora(request.getParameter("hora"));		
		capacitacion.setLugar(request.getParameter("lugar"));
		capacitacion.setDuracion(request.getParameter("duracion"));
		capacitacion.setCantidadAsistentes(Integer.parseInt(request.getParameter("cantidadAsistentes")));
					
		service.create(capacitacion);
			
		request.setAttribute("capacitaciones", service.read());
	
		getServletContext().getRequestDispatcher("/view/cliente/listarCapacitaciones.jsp").forward(request, response);

		doGet(request, response);
	}

}
