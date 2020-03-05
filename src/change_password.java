

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
 * Servlet implementation class change_password
 */
@WebServlet("/change_password")
public class change_password extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public change_password() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
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
		
		pw.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"	<title></title>\r\n" + 
				"	<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n" + 
				"\r\n" + 
				"</head>\r\n" + 
				" \r\n" + 
				"\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"  function check()\r\n" + 
				"  {\r\n" + 
				"    var v1=document.getElementById(\"new\").value;\r\n" + 
				"    var v2=document.getElementById(\"newold\").value;\r\n" + 
				"\r\n" + 
				"   if(v2!=v1)\r\n" + 
				"    {\r\n" + 
				"     document.getElementById(\"sp\").innerHTML=\"Not Matched\";\r\n" + 
				"      document.getElementById(\"sp\").style.color=\"red\";\r\n" + 
				"    }\r\n" + 
				"    else\r\n" + 
				"    {\r\n" + 
				"      document.getElementById(\"sp\").innerHTML=\"Matched\";\r\n" + 
				"      document.getElementById(\"sp\").style.color=\"green\";\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"  \r\n" + 
				"    window.onscroll = function() {scrollFunction()};\r\n" + 
				"    function scrollFunction() {\r\n" + 
				"      if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {\r\n" + 
				"          document.getElementById(\"myBtn\").style.display = \"block\";\r\n" + 
				"      } else {\r\n" + 
				"          document.getElementById(\"myBtn\").style.display = \"none\";\r\n" + 
				"      }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function topFunction() {\r\n" + 
				"    document.body.scrollTop = 0; \r\n" + 
				"    document.documentElement.scrollTop = 0; \r\n" + 
				"}\r\n" + 
				"</script>\r\n" + 
				"<style type=\"text/css\">\r\n" + 
				"					.topnav {\r\n" + 
				"				  overflow: hidden; \r\n" + 
				"				  background-color:#800000; \r\n" + 
				"				  margin-bottom:50px; \r\n" + 
				"				}\r\n" + 
				"				.topnav a\r\n" + 
				"				{  float: left; \r\n" + 
				"				  color:white; \r\n" + 
				"				  text-align: center; \r\n" + 
				"				  padding: 14px 16px; \r\n" + 
				"				  text-decoration: none; \r\n" + 
				"				  font-size: 17px; \r\n" + 
				"				} \r\n" + 
				"				.topnav-right { \r\n" + 
				"				  float: right; \r\n" + 
				"				} \r\n" + 
				"				.topnav a:hover { \r\n" + 
				"				  background-color: #ddd; \r\n" + 
				"				  color: black; \r\n" + 
				"				} \r\n" + 
				"				.topnav a.active { \r\n" + 
				"				  background-color: #4CAF50; \r\n" + 
				"				  color: white; \r\n" + 
				"				} \r\n" + 
				"				 \r\n" + 
				"				</style> \r\n" + 
				"				<body style=\"background: #008080;\">\r\n" + 
				"				<div class=\"container\"  > \r\n" + 
				"				<div class=\"container\">						<div class=\"card \" style=\"background: #F0F8FF;\"> \r\n" + 
				"								<div class=\"card-body\" style=\"width: 100%\"> \r\n" + 
				"									<div class=\"card-text\">\r\n" + 
				"										<div class=\"topnav\"> \r\n" + 
				"				 <a class=\"active\" href=\"Admin_home\">Home</a> \r\n" + 
				"				  <a href=\"Add_student\">Add Student</a>\r\n" + 
				"				   <a href=\"Add_question\">Add Question</a> \r\n" + 
				"				  <a href=\"Quiz_Setting\">Setting</a> \r\n" + 
				"				  <a href=\"Report\">Reports</a> \r\n" + 
				"				  <a href=\"change_password\">Change_password</a> \r\n" + 
				"				  <div class=\"topnav-right\"> \r\n" + 
				"				    <a href=\"Logout\">Logout</a> \r\n" + 
				"				  </div>\r\n" + 
				"				</div></div> \r\n" + 
				"\r\n" + 
				"<form action=\"Change_Admin_Password\" method=\"post\">\r\n" + 
				"<div class=\"insert_container container\" >\r\n" + 
				
				" <div class=\"row mt-5\">\r\n" + 
				"    <div class=\"col-md-6 mx-auto\">\r\n" + 
				"      <input type=\"text\" id=\"old\" name=\"old_pass\" placeholder=\"Enter Old Password\" class=\"form-control mt-2\" required=\"true\" autocomplete=\"off\">\r\n" + 
				"      <input type=\"text\" id=\"new\" name=\"new_pass\" placeholder=\"Enter New Password\" class=\"form-control mt-2\" required=\"true\" autocomplete=\"off\" onkeyup=\"check()\">\r\n" + 
				"      <input type=\"text\" id=\"newold\" name=\"conf\" placeholder=\"Confirm Password\" class=\"form-control mt-2\" required=\"true\" autocomplete=\"off\" onkeyup=\"check()\">\r\n" + 
				"      <center><span id=\"sp\" class=\"mt-3\"></span></center>\r\n" + 
				"      <input type=\"submit\" class=\"btn btn-danger mx-auto d-block mt-2 form-control\" name=\"change\" value=\"Change Password\"> \r\n" + 
				"  </div>\r\n" + 
				"</div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				
				"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String old=request.getParameter("old_pass");
		String new1=request.getParameter("new_pass");
		String newold=request.getParameter("conf");
		PrintWriter pw=response.getWriter();
		
	
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quiz","root","");
		
			
			Statement st=con.createStatement();
			String sql="select * from admin";
			
			ResultSet rs=st.executeQuery(sql);
			String password=null;
			String username=null;
			
			if(rs.next())
			{
				password=rs.getString("password");
				username=rs.getString("username");
				pw.println("password:"+password);
			}
			pw.println("Password:"+password);
			pw.println("Try Again");
			pw.println("Old:"+old);
			rs.close();
			st.close();
			
			
			if(password.equals(old))
			{
				st=con.createStatement();
				sql="update admin set password='"+newold+"' where username='"+username+"'";
				
				int r=st.executeUpdate(sql);
				
				if(r>0)
				{
					//pw.print("<script> alert('Success');</script>");	
					response.sendRedirect("change_password");
				}
				
			}
			else
			{
				pw.println("<html><head>");
				pw.println("</head>");
				pw.println("<body");
				pw.println("<script language=javascript");
				pw.println("alert \'Try Again\'");
				pw.println("</script>");
				pw.println("</body>");
				pw.println("</html>");
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

}
