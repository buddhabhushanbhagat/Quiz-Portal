

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
 * Servlet implementation class Start_quiz
 */
@WebServlet("/Start_quiz")
public class Start_quiz extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Start_quiz() {
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
	
			ResultSet rs=st.executeQuery(sql);
			pw.println("<form action='result' method='post'>");
			while(rs.next())
			{
				pw.println("<body style=\"background: #BC8F8F;\">\r\n" + 
						"	<div class=\"container\">\r\n" + 
						"		<div class=\"row\">\r\n" + 
						"			<div class=\"col-md-6 mx-auto mt-4\">\r\n" + 
						"				<div class=\"card\">\r\n" + 
						"					<div class=\"card-header\">\r\n" + 
						"						<h3>"+rs.getString(1)+")"+rs.getString(2)+"</h3>\r\n" + 
						"					</div>\r\n" + 
						"					<div class=\"card-body\">\r\n" + 
						"						   <input type='radio' name="+rs.getString(1)+" id=\"option1\" value=\"A\">\r\n" + 
						"						   <label for=\"option1\"> "+ rs.getString(3) +"</label><hr>\r\n" + 
						"						   <input type='radio' name="+rs.getString(1)+" id=\"option2\" value=\"B\">\r\n" + 
						"						   <label for=\"option2\"> "+ rs.getString(4) +"</label><hr>\r\n" + 
						"						   <input type='radio' name="+rs.getString(1)+" id=\"option3\" value=\"C\">\r\n" + 
						"						   <label for=\"option3\"> "+ rs.getString(5) +"</label><hr>\r\n" + 
						"						   <input type='radio' name="+rs.getString(1)+" id=\"option4\" value=\"D\">\r\n" + 
						"						   <label for=\"option4\"> "+ rs.getString(6) +"</label><hr>\r\n" + 
						"					</div>\r\n" + 
						"				</div>\r\n" + 
						"				<hr>\r\n" + 
						"			</div>\r\n" + 
						"		</div>\r\n" + 
						"	</div>\r\n" + 
						
						"\r\n" + 
						"\r\n" + 
						"</body>");
				}
			
			pw.println("<div class=\"container\">\r\n" + 
					"		<div class=\"row\">\r\n" + 
					"			<div class=\"col-md-6 mx-auto\">\r\n" + 
					"				<button class=\"btn btn-primary form-control mb-2\">Submit</button>\r\n" + 
					"			</div>\r\n" + 
					"		</div>\r\n" + 
					"	</div>");
			pw.println("</form>");
			st.close();
			con.close();			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	
	}

}
