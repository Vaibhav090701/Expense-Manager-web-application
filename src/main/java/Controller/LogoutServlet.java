package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Util.*;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("<!DOCTYPE html>\r\n>" );
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		
		HttpSession s=req.getSession();
		s.removeAttribute("currentUser");
		
		Util.Message m=new Message("Logout successfully!!!","success","alert-success");
		
		s.setAttribute("msg", m);
		
		resp.sendRedirect("login_page.jsp");
		
		out.println("</body>");
		out.println("</html>");





		
	}

}
