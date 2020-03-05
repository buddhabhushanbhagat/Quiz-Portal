

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Report
 */
@WebServlet("/Report")
public class Report extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Report() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw=response.getWriter();
		HttpSession session = request.getSession();
		
		if(session.getAttribute("admin")!=null ) {
			
		}
		else if(session.getAttribute("student") != null) {
				
			pw.println("<script>window.location='Student_home'</script>");
		}
			else {
				pw.println("<script>window.location='Login'</script>");
		}		
	
		//response.setContentType("application/vnd.ms-excel");
		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		response.setHeader("Content-Disposition", "inline; filename=Student-Report.xls");
	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quiz","root","");
			 
			 PreparedStatement ps = con.prepareStatement("select * from student_info");
			 ResultSet rs =  ps.executeQuery();
			 
			 pw.println("<table border='1' cellpadding='3' bordercolor='black'> <tr> <th> Roll Number </th> <th> Marks Obtained </th> <th> Total Marks </th> </tr>");
			 
			 while(rs.next())
			 {
				 if(rs.getString(3)!="")
				 {
					 pw.println("<tr>");
					 pw.println("<td>"+rs.getString(3)+"</td>");
					 pw.println("<td>"+rs.getString(6)+"</td>");
					 pw.println("<td>"+rs.getString(7)+"</td>");
					 pw.println("</tr>");
				 }
				 else if(rs.getString(3).equals("") && rs.getString(4).equals(""))
				 {
					 pw.println("<tr>");
					 pw.println("<td>"+rs.getString(6)+"</td>");
					 pw.println("<td>0</td>");
					 pw.println("<td>"+rs.getString(6)+"</td>");
					 pw.println("</tr>");
				 } 
				 else
				 {
					 pw.println("<tr>");
					 pw.println("<td>"+rs.getString(2)+"</td>");
					 pw.println("<td>0</td>");
					 pw.println("<td>0</td>");
					 pw.println("</tr>");
				 }
			 }
			 pw.println("</table>");
			 con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
