

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Quiz_Setting
 */
@WebServlet("/Quiz_Setting")
public class Quiz_Setting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Quiz_Setting() {
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
		p1.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Setting</title>\r\n" + 
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
				"		margin-left: 70px;\r\n" + 
				"		\r\n" + 
				"\r\n" + 
				"	}\r\n" + 
				"	label\r\n" + 
				"	{\r\n" + 
				"		font-size: 18px;\r\n" + 
				"		font-weight: lighter;\r\n" + 
				"		margin-left: 60px;\r\n" + 
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
				"<body style=\"background: #008080;\">\r\n" + 
				"<div class=\"container\">\r\n" + 
				"	\r\n" + 
				"		<div class=\"card \" style=\"background: #F0F8FF;\">\r\n" + 
				"				<div class=\"card-body\" style=\"width: 100%\">\r\n" + 
				"					<div class=\"card-text\">\r\n" + 
				"						<div class=\"topnav\">\r\n" + 
				"  <a class=\"active\" href=\"Admin_home\">Home</a>\r\n" + 
				"  <a href=\"Add_question\">Add Question</a>\r\n" + 
				"   <a href=\"Add_student\">Add Student</a>\r\n" + 
				" <a href=\"Quiz_Setting\">Setting</a>\r\n" + 
				"  <a href=\"Report\">Reports</a>\r\n" + 
				"  <a href=\"change_password\">Change_password</a>\r\n" + 
				"  <div class=\"topnav-right\">\r\n" + 
				"    <a href=\"Logout\">Logout</a>\r\n" + 
				"  </div>\r\n" + 
				"</div> \r\n" + 
				"<div class=\"container\" >\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div class=\"row mt-5\">\r\n" + 
				"    <div class=\"col-md-6 mx-auto\">\r\n" + 
				"\r\n" + 
				"	<div class=\"card\" >\r\n" + 
				"	<div class=\"card card-header form-control text-center\"><h3> Quiz Settings</h3>\r\n" + 
				"		<form action=\"Quiz_Setting\" method=\"post\">\r\n" + 
				"			<input type=\"date\" name=\"date\" placeholder=\"Enter Date\" class=\"form-control mt-2\" required=\"true\" autocomplete=\"off\" onkeyup=\"checkroll()\">\r\n" + 
				"			<input type=\"number\" name=\"time\" placeholder=\"Enter Time\" class=\"form-control mt-2\" required=\"true\" autocomplete=\"off\" onkeyup=\"checkstr()\">\r\n" + 
				"		      <input type=\"password\" name=\"pass\" placeholder=\"Enter Password\" class=\"form-control mt-2\" required=\"true\" autocomplete=\"off\"\">\r\n" + 
				"			  <input type=\"submit\" value=\"Add Settings\" class=\"btn btn-danger mx-auto d-block mt-4 form-control\" name=\"Insert\">\r\n" + 
				"		</form>\r\n" + 
				"	</div>\r\n" + 
				"</div>\r\n" + 
				"</div>\r\n" + 
				"</div>\r\n" + 
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
		java.util.Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		
		String time=request.getParameter("time");
		String pass=request.getParameter("pass");
		
		
		PrintWriter pw=response.getWriter();
	
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Quiz","root","");
			
			Statement st=con.createStatement();
			String sql="insert into Quiz_Settings values('"+sqlDate+"','"+time+"','"+pass+"')";
			
			int rs=st.executeUpdate(sql);
			

			if(rs>0)
			{
				pw.print("<script> alert('Quiz settings Added Successfully');</script>");
				response.sendRedirect("Quiz_Setting");
				
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
