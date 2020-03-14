package lu.EnVoyage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/lu.EnVoyage.Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static LanguageDB db = new LanguageDB();
	public Controller() {
		super();
		System.out.println("controller");
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		i18n(request, response);
		String command = "home";
		if (request.getParameter("command") != null) {
			command = request.getParameter("command");
		}
		String destination = handle_command(request, response, command);
		request.getRequestDispatcher(destination).forward(request, response);
	}

	public String home(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("origin", "home");
		return "index.jsp";
	}
	public String info(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("origin", "information");
		return "information.jsp";
	}
	public String pics(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("origin", "pictures");
		return "pictures.jsp";
	}
	public String contact(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("origin", "contact");
		return "contact.jsp";
	}

	public void i18n(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		System.out.println(session.getCreationTime());
		String lang = "en";
		System.out.println("lang= " + (String) session.getAttribute("i18n"));
		if (session.getAttribute("i18n") == null) {
			request.setAttribute("i18n", "en");
		} else {
			lang = (String) session.getAttribute("i18n");
		}
		request.setAttribute(
				"map",
					db.getTextDB(
							Language.fromCode(
									lang
							)
					).getMap()
//				"123"
		);
	}

	public String changeLanguage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lang = (String) request.getParameter("lang");
		HttpSession session = request.getSession();
		session.setAttribute("i18n", lang);
		i18n(request, response);
		String command = "home";
		if (request.getParameter("origin") != null) {
			command = request.getParameter("origin");
		}
		return handle_command(request, response, command);
	}

	public String handle_command(HttpServletRequest request, HttpServletResponse response, String command) throws ServletException, IOException {
		String destination;
		System.out.println("command=" + command);
		switch(command) {
			case "home" :
				destination = home(request, response);
				break;
			case "information" :
				System.out.println("information");
				destination = info(request, response);
				break;
			case "pictures" :
				destination = pics(request, response);
				break;
			case "contact" :
				destination = contact(request, response);
				break;
			case "changeLanguage" :
				destination = changeLanguage(request, response);
				break;

			default :
				destination = changeLanguage(request, response);
		}
		return destination;
	}
}
