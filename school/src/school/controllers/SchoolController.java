package school.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import school.models.SchoolDAO;
import school.models.SchoolDTO;

<<<<<<< HEAD

@WebServlet("/school")
=======
@WebServlet("/schoolsignal")
>>>>>>> branch 'master' of https://github.com/jejucityboy/schoolsignal.git
public class SchoolController extends HttpServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		SchoolDAO deptDAO = SchoolDAO.getInstance();
		List<SchoolDTO> list = deptDAO.getDeptList();

		request.setAttribute("list", list);
		request.setAttribute("title", "학교위치");
<<<<<<< HEAD
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("schoolSignal/kakaoAPI.jsp");
=======

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/SchoolLocation.jsp");
>>>>>>> branch 'master' of https://github.com/jejucityboy/schoolsignal.git
		dispatcher.forward(request, response);
	}

}
