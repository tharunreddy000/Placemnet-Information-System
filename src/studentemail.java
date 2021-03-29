

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentemail")
public class studentemail extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public studentemail() {
        super();
    }
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            PrintWriter out = response.getWriter();
          String email = request.getParameter("email");
            if(Validate.checkemail_in_applicationform(email))
            {
            
            	if(Validate.checkemail_in_job(email)) {
            		response.sendRedirect("eligible.jsp");
            	}
            	else {
            		response.sendRedirect("buffering.html");
            	}
            
            }
            else {
    			response.sendRedirect("noteligible.jsp");
    		}
               
            }
             
        }
