package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.UserDAO;
import Model.UserDTO;
import Util.Message;

@WebServlet("/RegisterServlet")
public class RegisterationServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		String check=req.getParameter("check");
		
		resp.setContentType("text/html");
		pw.print("<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n"
				+ "<link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n"
				+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n");
		
		
		if(check==null)
		{	
			Message msg=new Message("Please agree Terms and Conditions!","error","alert-danger");
			HttpSession s=req.getSession();
			s.setAttribute("msg", msg);
			
			resp.sendRedirect("register_page.jsp");
		}
		else {
			String name=req.getParameter("user_name");
			String email=req.getParameter("user_email");
			String password=req.getParameter("user_password");
			String gender=req.getParameter("gender");
			String about=req.getParameter("about");
			
			UserDTO dto=new UserDTO(name,email,password,gender,about);
			
			UserDAO dao=new UserDAO();
			int count=dao.insertData(dto);
			
			if(count==1)
			{
	            Cookie emailCookie = new Cookie("userEmail", email);
	            emailCookie.setMaxAge(60 * 60 * 24 * 30); // Cookie lasts for 30 days
	            resp.addCookie(emailCookie);
	           
	            req.setAttribute("dto", dto);
	            req.getRequestDispatcher("login_page.jsp").forward(req, resp);

			}

			else {
				RequestDispatcher rd=req.getRequestDispatcher("register_page.jsp");
				pw.print("<h2>Something went wrong!!!</h2>");
				rd.include(req, resp);
				
			}
			
		}
	}


}
