

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/placementselection")
public class placementselection extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public placementselection() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html ");
        PrintWriter out = response.getWriter();
	
        String email = request.getParameter("studentemail");
        System.out.println(email);
        	
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/lab","root","@9848396526At");
            PreparedStatement ps = con.prepareStatement
                        ("insert into  job values(?)");
            ps.setString(1, email);
            ps.executeUpdate();
             response.sendRedirect("teacheraccess");	
        }
        catch(Exception se) {
            se.printStackTrace();
        }
	}
}
         

