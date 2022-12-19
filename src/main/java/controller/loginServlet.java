package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserBean;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginServlet() {
		super();

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("views/welcome.jsp");
		rd.forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("username");
		String password = request.getParameter("password");
		UserBean userBean = new UserBean();
		
		userBean.setUserName(user);
		userBean.setPassWord(password);
		
		if (userBean.users()) {
			HttpSession session = request.getSession();
			
			session.setAttribute("userBean", userBean);

			RequestDispatcher rd = request.getRequestDispatcher("views/welcome.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("views/error.jsp");
		}
	}
}