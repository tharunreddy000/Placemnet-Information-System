import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/deleteapplication")
public class deleteapplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public deleteapplication() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String studentemail = request.getParameter("reenteremail");
        System.out.println(studentemail);
            try{  
            	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","@9848396526At"); 
                PreparedStatement ps=con.prepareStatement("delete from applications where email_id like '"+studentemail+"';");  
                ps.executeUpdate();                
                con.close();
                response.sendRedirect("teacheraccess");
            }catch(Exception e){e.printStackTrace();}  
        }
	}
