

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("name");
		String uemail =request.getParameter("email");
		String ucity=request.getParameter("city");
		String upassword=request.getParameter("password");
		String uphone=request.getParameter("phone");
		
		Model model=new Model();
		model.setName(uname);
		model.setEmail(uemail);
		model.setCity(ucity);
		model.setPassword(upassword);
		model.setPhone(uphone);
		
		int row = model.register();
		HttpSession session = request.getSession();
		
		session.setAttribute("name", uname);
		if(row==0)
		{
			response.sendRedirect("/RegistrationAppMVC/failure.jsp");
		}
		else
		{
			response.sendRedirect("/RegistrationAppMVC/success.jsp");
		}
		
		
	}

}
