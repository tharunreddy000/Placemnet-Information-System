

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contactus")
public class contactus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public contactus() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html ");
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message=request.getParameter("message");
        System.out.println(name);
        try {
        
            // loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");
            
            //creating connection with the database 
            Connection con = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/project","root",new Credentials().password);

            PreparedStatement ps = con.prepareStatement
                        ("insert into contactus values(?,?,?,?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, subject);
            ps.setString(4, message);
            ps.executeUpdate();
            
            	 RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
                 rs.forward(request, response);
        }
        catch(Exception se) {
            se.printStackTrace();
        }
        }
	}
