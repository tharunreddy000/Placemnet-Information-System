import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.email.durgesh.Email;

public class forgot extends HttpServlet {
	static String username;
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	PrintWriter out =response.getWriter();
    		 username=request.getParameter("forgotemail");
    		if(Validate.forgot(username)) {
    		 EmailSender.emailaddres(username);
    		 EmailSender.emailotp(null);
    			RequestDispatcher rs = request.getRequestDispatcher("EmailSender.jsp");
                rs.forward(request, response);
    		}
        		else {
        			response.sendRedirect("forgot.jsp");
        		}
   		 }
    
    public static String emailsender() {
		return username;
    	
    }
    }
