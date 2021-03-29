import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class teacherverfiy extends HttpServlet {
 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	PrintWriter out =response.getWriter();
    		String teacherid=request.getParameter("empid");
    		out.print(teacherid);
    		 if(Validate.checkid(teacherid)) {
    			 response.sendRedirect("teacheraccess");
         	}
         		else {
         			response.sendRedirect("Login.html");
         		}
    		 }
    protected void doPost(HttpServletRequest req,
            HttpServletResponse res) throws ServletException, IOException {
    	doGet(req,res);
    }
}
