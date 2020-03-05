

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Add_student
 */
@WebServlet("/Add_student")
public class Add_student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add_student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 HttpSession session=request.getSession();
		 PrintWriter out=response.getWriter(); 
		 if(session.getAttribute("admin")!=null)
		 {
			
		 }else
			 	if(session.getAttribute("student")!=null) {
			 out.println("<script>window.location='Student_home'</script>");
		 }else {
			 out.println("<script>window.location='Login'</script>");
		 }
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Add Student</title>\r\n" + 
				"</head>\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css\" integrity=\"sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B\" crossorigin=\"anonymous\">\r\n" + 
				"<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js\" integrity=\"sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<style type=\"text/css\">\r\n" + 
				"body\r\n" + 
				"{\r\n" + 
				"		\r\n" + 
				"	\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"	.Registration{\r\n" + 
				"		font-size: 40px;\r\n" + 
				"		font-weight: 700px;\r\n" + 
				"		border-bottom:ridge;\r\n" + 
				"		font-family: Agency FB;\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"	.text\r\n" + 
				"	{\r\n" + 
				"		height: 30px;\r\n" + 
				"		font-weight: lighter;\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"\r\n" + 
				"	}\r\n" + 
				"	label\r\n" + 
				"	{\r\n" + 
				"		font-size: 18px;\r\n" + 
				"		font-weight: lighter;\r\n" + 
				"		\r\n" + 
				"		font-family: \"times new Roman\";\r\n" + 
				"	}\r\n" + 
				"	.btn-primary\r\n" + 
				"	{\r\n" + 
				"		border-radius: 0px;\r\n" + 
				"		padding: 10px;\r\n" + 
				"		width: 50%;\r\n" + 
				"\r\n" + 
				"	}\r\n" + 
				"	.btn-danger\r\n" + 
				"	{\r\n" + 
				"		border-radius: 0px;\r\n" + 
				"		padding: 10px;\r\n" + 
				"		width: 45%;\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"	.topnav {\r\n" + 
				"  overflow: hidden;\r\n" + 
				"  background-color:#800000;\r\n" + 
				"  margin-bottom:50px;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".topnav a {\r\n" + 
				"  float: left;\r\n" + 
				"  color: #f2f2f2;\r\n" + 
				"  text-align: center;\r\n" + 
				"  padding: 14px 16px;\r\n" + 
				"  text-decoration: none;\r\n" + 
				"  font-size: 17px;\r\n" + 
				"}\r\n" + 
				".topnav-right {\r\n" + 
				"  float: right;\r\n" + 
				"}\r\n" + 
				".topnav a:hover {\r\n" + 
				"  background-color: #ddd;\r\n" + 
				"  color: black;\r\n" + 
				"}\r\n" + 
				".topnav a.active {\r\n" + 
				"  background-color: #4CAF50;\r\n" + 
				"  color: white;\r\n" + 
				"}\r\n" + 
				"	\r\n" + 
				"</style>\r\n" + 
				"\r\n" + 
				"<body style=\"background: #008080;\">\r\n" + 
				"	\r\n" + 
				"\r\n" + 
				"	<div class=\"container\">\r\n" + 
				"	\r\n" + 
				"		<div class=\"card \" style=\"background: #F0F8FF;\">\r\n" + 
				"				<div class=\"card-body\" style=\"width: 100%\">\r\n" + 
				"					<div class=\"card-text\">\r\n" + 
				"						<div class=\"topnav\">\r\n" + 
				"  <a class=\"active\" href=\"Admin_home\">Home</a>\r\n" + 
				"  <a href=\"Add_question\">Add Question</a>\r\n" + 
				"   <a href=\"Add_student\">Add Student</a>\r\n" + 
				" <a href=\"Quiz_Setting\">Setting</a>\r\n" + 
				"  <a href=\"Report.html\">Reports</a>\r\n" + 
				"  <a href=\"change_password\">Change_password</a>\r\n" + 
				"  <div class=\"topnav-right\">\r\n" + 
				"    <a href=\"Logout\">Logout</a>\r\n" + 
				"  </div>\r\n" + 
				"</div> \r\n" + 
				"\r\n" + 
				"	<div class=\"row \">\r\n" + 
				"		<div class=\"col-md-6 mx-auto \" id=\"form\" >\r\n" + 
				"		<div class=\"card\">\r\n" + 
				"		<div class=\"card card-header form-control text-center\"><h3> Add Student</h3></div>\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"					<form action=\"Add_student\" class=\"form-control\" method=\"post\"  >\r\n" + 
				"					\r\n" + 
				"					\r\n" + 
				"					\r\n" + 
				"						<div class=\"form-group\">\r\n" + 
				"							<label for=\"fname\" class=\"col-md-4 \"><strong>First name :\r\n" + 
				"							</strong></label>\r\n" + 
				"							<input  type=\"text\" name=\"first_name\"  placeholder=\"Enter First Name\" required=\"\" class=\"form-control text col-md-12\">\r\n" + 
				"							<div class=\"form-group\">\r\n" + 
				"								<label for=\"lname\" class=\"col-md-4\"><strong>Last Name:</strong></label>\r\n" + 
				"								<input  type=\"text\" name=\"last_name\" placeholder=\"Enter Last Name\" required=\"\" class=\"form-control text col-md-12\">\r\n" + 
				"								<div class=\"form-group\">\r\n" + 
				"									<label for=\"uname\" class=\"col-md-4\"><strong>Username:</strong></label>\r\n" + 
				"								<input  type=\"text\" name=\"uname\"  placeholder=\"Enter Username \" required=\"\" class=\"form-control text col-md-12\">\r\n" + 
				"								<label for=\"pass\" class=\"col-md-4\"><strong>Password:</strong></label>\r\n" + 
				"								<input  type=\"Password\" name=\"pass\" placeholder=\"Enter Password\" required=\"\" class=\"form-control text col-md-12\" >\r\n" + 
				"								\r\n" + 
				"								<div class=\"form-group\">\r\n" + 
				"										<label for=\"student_class\" class=\"col-md-4\" ><strong>Class:</strong></label>\r\n" + 
				"										<select name=\"class_name\" class=\"form-control text col-md-12\" \">\r\n" + 
				"											<option value=\"select\">select class :</option>\r\n" + 
				"											<option value=\"fy\">fy</option>\r\n" + 
				"											<option value=\"sy\">sy</option>\r\n" + 
				"											<option value=\"ty\">ty</option>\r\n" + 
				"											<option value=\"btech\">btech</option>\r\n" + 
				"										</select>\r\n" + 
				"										</div>\r\n" + 
				"									\r\n" + 
				"									<div class=\"form-group \" >\r\n" + 
				"									<input type=\"submit\" class=\"btn btn-primary\" name=\"log\" value=\"Add Student\">\r\n" + 
				"									<input type=\"reset\" name=\"reset\" value=\"Clear\" class=\"btn btn-danger\">\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"									</div>\r\n" + 
				"								</div>\r\n" + 
				"\r\n" + 
				"							</div>\r\n" + 
				"							</div>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"					</div>\r\n" + 
				"				</div>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"</form>\r\n" + 
				"</div>\r\n" + 
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
		 PrintWriter out=response.getWriter(); 
		
		if(session.getAttribute("admin")!=null)
		 {
			 pw.println("<script>window.location='Admin_home'</script>");
		 }else  if(session.getAttribute("student")!=null)
		 {
			 pw.println("<script>window.location='Student_home'</script>");
		 }
		String fname=request.getParameter("first_name");
		String lname=request.getParameter("last_name");
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		String year=request.getParameter("class_name");
		
		
	
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quiz","root","");
			
			java.sql.Statement st=con.createStatement();
			String sql="insert into student_info values('"+fname+"','"+lname+"','"+username+"','"+password+"','"+year+"')";
			
			int rs=st.executeUpdate(sql);
			
			if(rs>0)
			{
				response.sendRedirect("Add_student");
				
			}
			
			st.close();
			con.close();			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
