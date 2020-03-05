

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Admin_home
 */
@WebServlet("/Admin_home")
public class Admin_home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_home() {
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
		System.out.println(session.getAttribute("admin"));
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Admin_home</title>\r\n" + 
				"</head>\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css\" integrity=\"sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B\" crossorigin=\"anonymous\">\r\n" + 
				"<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js\" integrity=\"sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em\" crossorigin=\"anonymous\"></script>\r\n" + 
				"\r\n" + 
				"<style type=\"text/css\">\r\n" + 
					"body {\r\n" + 
					" 	background: url('D:\\Servlet Projects\\McqQuiz\\src\\6809799-skin-wallpaper.jpg') no-repeat center center fixed; \r\n" + 
					"-webkit-background-size: cover;\r\n" + 
					"-moz-background-size: cover;\r\n" + 
					"-o-background-size: cover;\r\n" + 
					"background-size: cover;\r\n" + 
					"	 }\r\n" + 
					".card\r\n" + 
					"{\r\n" + 
					"	background: url('D:\\Servlet Projects\\McqQuiz\\src\\6809799-skin-wallpaper.jpg') no-repeat center center fixed; \r\n" + 
					"-webkit-background-size: cover;\r\n" + 
					"-moz-background-size: cover;\r\n" + 
					"-o-background-size: cover;\r\n" + 
					"background-size: cover;\r\n" + 
					"	\r\n" + 
					"}\r\n" + 
					".responsive {\r\n" + 
					"    width: 100%;\r\n" + 
					"    height: auto;\r\n" + 
					"}"+
				".topnav {\r\n" + 
				"  overflow: hidden;\r\n" + 
				"  background-color:#800000;\r\n" + 
				"  margin-bottom:50px;\r\n" + 
				"}\r\n" + 
				".topnav a {\r\n" + 
				"  float: left;\r\n" + 
				"  color:white;\r\n" + 
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
				"	<div class=\"container \">\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<div class=\"col-md-12\">\r\n" + 
				"		\r\n" + 
				"	\r\n" + 
				"		<div class=\"card \" style=\"background: #F0F8FF;\">\r\n" + 
				"				<div class=\"card-body\" style=\"width: 100%\">\r\n" + 
				"					<div class=\"card-text\">\r\n" + 
				"						<div class=\"topnav\">\r\n" + 
				" <a class=\"active\" href=\"Admin_home\">Home</a>\r\n" + 
				"  <a href=\"Add_student\">Add Student</a>\r\n" + 
				"   <a href=\"Add_question\">Add Question</a>\r\n" + 
				"  <a href=\"Quiz_Setting\">Setting</a>\r\n" + 
				"  <a href=\"Report\">Reports</a>\r\n" + 
				"  <a href=\"change_password\">Change_password</a>\r\n" + 
				"  <div class=\"topnav-right\">\r\n" + 
				"    <a href=\"Logout\">Logout</a>\r\n" + 
				"  </div>\r\n" + 
				"</div> \r\n" + 
				"<div class=\"container\">\r\n" + 
				"<div class=\"card card-header form-control text-center\"><h3> Admin Welcome</h3>\r\n" + 
				"</div> \r\n" + 
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
		doGet(request, response);
	}

}
