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


@WebServlet("/apply")
public class apply extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
    public apply() {
        super();
    }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html ");
    PrintWriter out = response.getWriter();
        String StudentName = request.getParameter("name");
        String mobileno = request.getParameter("mobilenumber");
        String email_id = request.getParameter("email");
        String aadharno = request.getParameter("adhar");
        String dob = request.getParameter("bdate");
        String address = request.getParameter("address");
        String branch = request.getParameter("branch");
        String cgpa = request.getParameter("CGPA");
        String certificatelink=request.getParameter("Link");
        String degree=request.getParameter("category");

        
        try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab?autoReconnect=true&useSSL=false","root","@9848396526At");
      PreparedStatement ps = con.prepareStatement("insert into  applications values(?,?,?,?,?,?,?,?,?,?)");
         ps.setString(1, StudentName);
         ps.setString(2, mobileno);
         ps.setString(3, email_id);
         ps.setString(4, aadharno);
         ps.setString(5, dob);
         ps.setString(6, address);
         ps.setString(7, branch);
         ps.setString(8, cgpa);
         ps.setString(9, certificatelink);
         ps.setString(10, degree);
         int i=ps.executeUpdate(); 

			if(i > 0) {
        			if(Validate.cat(email_id).equals("UG")){
        				
        				response.sendRedirect("afterloginug.jsp");
        			}
        			else {
        				response.sendRedirect("afterloginpg.jsp");
        			}
            }
        
        	else {
       	 RequestDispatcher rs = request.getRequestDispatcher("apply.jsp");
			rs.forward(request, response);
        }
        }
        catch(Exception se) {
            se.printStackTrace();
        }
	}

}




