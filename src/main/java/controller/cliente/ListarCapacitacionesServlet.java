package controller.cliente;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.CapacitacionService;
import model.service.CapacitacionServiceImpl;

@WebServlet("/ListarCapacitaciones")
public class ListarCapacitacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CapacitacionService service = new CapacitacionServiceImpl();

    public ListarCapacitacionesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("capacitaciones", service.read());
		
		getServletContext().getRequestDispatcher("/view/cliente/listarCapacitaciones.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
