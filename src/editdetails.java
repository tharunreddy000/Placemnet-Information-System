

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qwerty.user;

/**
 * Servlet implementation class editdetails
 */
@WebServlet("/editdetails")
public class editdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editdetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String StudentName = request.getParameter("email");
		if (Validate.filled(StudentName)){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root",new Credentials().password);
	            Statement ps = con.createStatement();
	            ResultSet rs =ps.executeQuery("select * from applications where email like '"+StudentName+"';");
	            user u=new user();
	            while(rs.next()) {
	            	u.setName(rs.getString(1));
	            	u.setMobile(rs.getString(2));
	            	u.setEmail1(rs.getString(3));
	            	u.setAdar(rs.getString(4));
	            	u.setDob(rs.getString(5));
	            	u.setAdd(rs.getString(6));
	            	u.setBranch(rs.getString(7));
	            	u.setCgpa(rs.getString(8));
	            	u.setLink(rs.getString(9));
	            	u.setDegree(rs.getString(10));
	              }
	            
	            RequestDispatcher rd=request.getRequestDispatcher("updatedetails.jsp");
	            request.setAttribute("u",u);
	            rd.forward(request, response);
			} 
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println(StudentName);
	}

}
