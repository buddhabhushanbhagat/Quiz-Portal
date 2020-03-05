

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter p1=response.getWriter();
		p1.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Please Login</title>\r\n" + 
				"</head>\r\n" + 
				"<link rel=\"stylesheet\" href=\"body.css\">\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css\" integrity=\"sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B\" crossorigin=\"anonymous\">\r\n" + 
				"<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js\" integrity=\"sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<style type=\"text/css\">\r\n" + 
				"body\r\n" + 
				"{\r\n" + 
				"width: 100%;\r\n" + 
				"height: 100vh;\r\n" + 
				"}\r\n" + 
				".text\r\n" + 
				"	{\r\n" + 
				"		height: 43px;\r\n" + 
				"	\r\n" + 
				"	}\r\n" + 
				"	.login{\r\n" + 
				"		font-size: 300%;\r\n" + 
				"		text-decoration-color: white;\r\n" + 
				"		font-family: \"times new Roman\";\r\n" + 
				"	\r\n" + 
				"	}\r\n" + 
				"	#form{\r\n" + 
				"		/*width: 500px;\r\n" + 
				"	margin=0 auto;\r\n" + 
				"	background-color:	;\r\n" + 
				"	padding: 5px;\r\n" + 
				"	border-radius: 31px;\r\n" + 
				"	border: solid #2c3e50;\r\n" + 
				"	margin-left: 300px;\r\n" + 
				"	margin-top: 100px;*/\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				".btn-primary\r\n" + 
				"	{\r\n" + 
				"		border-radius: 0px;\r\n" + 
				"		padding: 10px;\r\n" + 
				"		width: 100%;\r\n" + 
				"		margin-left: \r\n" + 
				"\r\n" + 
				"	}\r\n" + 
				"	label\r\n" + 
				"	{\r\n" + 
				"		font-size:20px;\r\n" + 
				"		font-weight: bold;\r\n" + 
				"		font-family: \"times new Roman\";\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"</style>\r\n" + 
				"\r\n" + 
				"<body style=\"background: #8B4513;\" >\r\n" + 
				"<div class=\"container\">\r\n" + 
				"		<div class=\"row mt-5\">\r\n" + 
				"			<div class=\"col-sm-6 mx-auto  col-mid-offset-3\" id=\"form\">\r\n" + 
				"				<div class=\"card\" ;\">\r\n" + 
				"<div class=\"card-header\" style=\"background: #471605;\">\r\n" + 
				"               <div class=\"card-title \">\r\n" + 
				"                   <center><h3 style=\"color: white;\"> Login</h3></center>\r\n" + 
				"               </div>\r\n" + 
				"            </div>				"
				+ 				"<div class=\"card-body\" style=\"background: khaki;\">\r\n" + 
				"				<form action=\"Login\" method=\"post\" class=\"formid\" >\r\n" + 
				"					<div class=\"form-group \">\r\n" + 
				
				"							</div>\r\n" + 
				"								<div class=\"form-group\">\r\n" + 
				"									<label for=\"user\" class=\"col-md-4 \">					<strong>Select User</strong></label>\r\n" + 
				"											<select name=\"user_type\" id=\"user_type\" >\r\n" + 
				"				\r\n" + 
				"				<option value=\"Admin\" class=\"font-weight-bold\">Admin</option>\r\n" + 
				"				<option value=\"Student\">Student</option>\r\n" + 
				"			</strong>\r\n" + 
				"			</select>\r\n" + 
				"		</div>\r\n" + 
				"								<div class=\"form-group\">\r\n" + 
				"									<label for=\"usname\" class=\"col-md-5 \"><strong>Username:</strong></label>\r\n" + 
				"									<input type=\"text\" name=\"uname\" id=\"uname\" placeholder=\"Enter Username\" required=\"please Enter username\" class=\"form-control text\">\r\n" + 
				"								</div>\r\n" + 
				"									<div class=\"form-group\">\r\n" + 
				"										<label for=\"password\" class=\"col-md-5 \" ><strong>Password :</strong></label>\r\n" + 
				"										<input type=\"password\"  name=\"password\" id=\"uname\" placeholder=\"Enter Password\" required  class=\"form-control text\">\r\n" + 
				"									</div>	\r\n" + 
				"								<div class=\"form-group \" >\r\n" + 
				"									<BUTTON type=\"submit\" class=\"btn btn-primary \" name=\"login\" id=\"lodin\">Login</BUTTON>\r\n" + 
				"								</div>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"					</div>\r\n" + 
				"				</div>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"</form>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession();
		pw.print("hello");
		System.out.println(session.getAttribute("admin"));
		 if(session.getAttribute("admin")!=null)
		 {
			 pw.println("<script>window.location='Admin_home'</script>");
		 }else  if(session.getAttribute("student")!=null)
		 {
			 pw.println("<script>window.location='Student_home'</script>");
		 }
		
		String username=request.getParameter("uname");
		String password=request.getParameter("password");
		String user_type=request.getParameter("user_type");
		
		
		
		response.setContentType("text/html");
		
	
		
	
		if(user_type.equals("Admin"))
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Quiz","root","");
			
				java.sql.Statement st=con.createStatement();
				String sql="select * from admin";
				
				ResultSet rs=st.executeQuery(sql);
				
				while(rs.next())
				{
					if(username.equals(rs.getString("username")) && password.equals(rs.getString("password")))
					{
						//pw.print("<script> alert('Login Successfull');</script>");
						  
					        session.setAttribute("admin",username);  
						response.sendRedirect("Admin_home");
						
					}
					else
					{
						//pw.print("<script> alert('Try Again');</script>");
						response.sendRedirect("Login");
					}
				}	
				rs.close();
				st.close();
				con.close();			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Quiz","root","");
				if(con!=null) {
					pw.println("Connection Done");
				}
				else {
					pw.println("Connection Failed");
				}
				
				
				Statement st=(Statement) con.createStatement();
				String sql="select * from student_info";
				
				ResultSet rs=st.executeQuery(sql);
				
				while(rs.next())
				{
					if(username.equals(rs.getString("username")) && password.equals(rs.getString("password")))
					{
						
						  session.setAttribute("student",username);  
						response.sendRedirect("Student_home");
						  
					      
					}
					else
					{
						//pw.print("<script> alert('Try Again');</script>");
						response.sendRedirect("Login");
					}
				}
				rs.close();
				st.close();
				con.close();			
			}
			catch(Exception e)
			{
				e.printStackTrace();
				pw.print(e);
			}
		}
	}

}
