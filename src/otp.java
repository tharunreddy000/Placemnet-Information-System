

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.email.durgesh.Email;
import java.util.Random; 
 
@WebServlet("/otp")
public class otp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String String = null;
 
    public otp() {
        super();
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 String otpemail = request.getParameter("otpemail");
    	 String mailotp=EmailSender.mailotp(null);
    	 System.out.println(mailotp);
    	 if(otpemail.equals(mailotp)) {
    		 RequestDispatcher rs = request.getRequestDispatcher("repassword.jsp");
             rs.forward(request, response);
    	 }
    	 else {
    		 response.sendRedirect("forgot.jsp");
    	 }
    }
}
