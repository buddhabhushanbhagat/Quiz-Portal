

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class result
 */
@WebServlet("/result")
public class result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public result() {
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
		//doGet(request, response);
		response.setContentType("text/html");	
		PrintWriter pw = response.getWriter();
		pw.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css\" integrity=\"sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B\" crossorigin=\"anonymous\">\r\n" + 
				"");
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quiz","root","");
			response.setContentType("text/html");
			Statement st=con.createStatement(); 
			String sql="select * from add_que";
			
			int marks=0;
			ResultSet rs=st.executeQuery(sql);
			pw.println("<form action='result' method='post'>");
			int total=0;
			pw.println("<body style=\"background: #BC8F8F;\">\r\n" + 
					"	<div class=\"container\">\r\n" + 
					"		<div class=\"row\">\r\n" + 
					"			<div class=\"col-md-8 mx-auto mt-4\">\r\n" + 
					"				<div class=\"card\">\r\n" +
					"					<div class=\"card-header form-control text-center\">\r\n"+
					"						<h3>Student Mark</h3>\r\n" + 
					"					</div>\r\n" +
		"<div class=\"card-body\">\r\n");
			
			while(rs.next())
			{
				String option=request.getParameter(rs.getString(1));
				pw.println(	
	    				
	    		
	    				"						<label>Your answer of Que \n"+rs.getString(1)+"="+option+"</label>\r\n" );
				
			//pw.println("Your Answer of Que "+rs.getString(1)+"="+option+"");
			
				total=total+rs.getInt(8);
				String correct="";
				if(rs.getString(3).equals(rs.getString(7)))
				{
					correct="A";
				pw.println("<label>Correct answer of:\n"+rs.getString(1)+"="+correct+"</label class=\"form-control\"><br>\r\n");  
									
				}
				
				else if(rs.getString(4).equals(rs.getString(7))) {
						correct="B";	
						pw.println("<label>Correct answer of:\n"+rs.getString(1)+"="+correct+"</label class=\"form-control\"><br>\r\n");
				}
				else if(rs.getString(5).equals(rs.getString(7)))
				{		correct="C";
				pw.println("<label>Correct answer of:\n"+rs.getString(1)+"="+correct+"</label class=\"form-control\"><br>\r\n");
				}
				else if(rs.getString(6).equals(rs.getString(7))) {
						correct="D";
						pw.println("<label>Correct answer of:\n"+rs.getString(1)+"="+correct+"</label class=\"form-control\"><br>\r\n" );
				}
					
				if(option.equals(correct))
				{
					marks=marks+rs.getInt(8);
					
					
				}
				pw.println();
			
			}
			
			pw.println("<div class=\"card-footer form-control mt-5\">\r\n" + 
					"   <h5> Marks Obatin are " +marks+" out of "+total+"</h5>\r\n" );
			pw.println("</div>");
			pw.println("<a href=\"Student_home\" class=\" btn btn-primary \"><div class=\"float-right\">Back to Home</div></a>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
