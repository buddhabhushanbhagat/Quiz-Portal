

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
 * Servlet implementation class Add_question
 */
@WebServlet("/Add_question")
public class Add_question extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add_question() {
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
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Add Question</title>\r\n" + 
				"</head>\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css\" integrity=\"sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B\" crossorigin=\"anonymous\">\r\n" + 
				"<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js\" integrity=\"sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em\" crossorigin=\"anonymous\"></script>\r\n" + 
				"\r\n" + 
				"<style type=\"text/css\">\r\n" + 
				" body {\r\n" + 
				" 	background: url('images(2).jpg') no-repeat center center fixed; \r\n" + 
				"-webkit-background-size: cover;\r\n" + 
				"-moz-background-size: cover;\r\n" + 
				"-o-background-size: cover;\r\n" + 
				"background-size: cover;\r\n" + 
				"	 }\r\n" + 
				".card\r\n" + 
				"{\r\n" + 
				"	background: url('images(2).jpg') no-repeat center center fixed; \r\n" + 
				"-webkit-background-size: cover;\r\n" + 
				"-moz-background-size: cover;\r\n" + 
				"-o-background-size: cover;\r\n" + 
				"background-size: cover;\r\n" + 
				"	\r\n" + 
				"}\r\n" + 
				".que{\r\n" + 
				"	background: url('images(2).jpg') no-repeat center center fixed; \r\n" + 
				"-webkit-background-size: cover;\r\n" + 
				"-moz-background-size: cover;\r\n" + 
				"-o-background-size: cover;\r\n" + 
				"background-size: cover;\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".responsive {\r\n" + 
				"    width: 100%;\r\n" + 
				"    height: auto;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				".topnav {\r\n" + 
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
				"<div class=\"container \">\r\n" + 
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
				"\r\n" + 
				"<div class=\"row\">\r\n" + 
				"<div class=\"col-md-12 mx-auto\">\r\n" + 
				"		<div class=\"card align-items-center\">\r\n" + 
				"		<div class=\" card-header form-control text-center\"><h3> Add Question</h3></div>\r\n" + 
				"		\r\n" + 
				"					<form action=\"Add_question\"  class=\"form-control que\" method=\"post\"  >\r\n" + 
				"					\r\n" + 
				"				\r\n" + 
				"						<div class=\"form-group\">\r\n" + 
				/*"							<label for=\"Qno\" class=\"col-md-4 mt-4\"><b>Question no :\r\n" + 
				"							</b></label>\r\n" + 
				"							<input  type=\"text\" name=\"Que_no\"  placeholder=\"Enter Question no\" required=\"\" class=\"form-control text col-md-12\"><br>\r\n" +*/ 
				"							<div class=\"form-group \">\r\n" + 
				"								<label for=\"Qname\" class=\"col-md-4\"><b>Question Name:</b></label>\r\n" + 
				"								<input type=\"text\"  placeholder=\"Enter Question\" name=\"Que_name\" required=\"\" class=\"form-control text col-md-12\"> <br>\r\n" + 
				"								<div class=\"form-group\">\r\n" + 
				"									<label for=\"option1\" class=\"col-md-4\"><strong>Option 1:</strong></label>\r\n" + 
				"										<label for=\"option2\" class=\"col-md-4\"><strong>Option 2:</strong></label>\r\n" + 
				"								<input  type=\"text\" name=\"op1\"  placeholder=\"Enter First Option \" required=\"\" class=\" text col-md-4\">\r\n" + 
				"								\r\n" + 
				"									\r\n" + 
				"								\r\n" + 
				"								<input  type=\"text\" name=\"op2\"  placeholder=\"Enter Second Option \" required=\"\" class=\" text col-md-4\"><br><br>\r\n" + 
				"								<div class=\"form-group\">\r\n" + 
				"									<label for=\"option3\" class=\"col-md-4\"><strong>Option 3:</strong></label>\r\n" + 
				"									<label for=\"option4\" class=\"col-md-4\"><strong>Option 4:</strong></label>\r\n" + 
				"								<input  type=\"text\" name=\"op3\"  placeholder=\"Enter Third Option \" required=\"\" class=\" text col-md-4\">\r\n" + 
				"								\r\n" + 
				"								\r\n" + 
				"								<input  type=\"text\" name=\"op4\"  placeholder=\"Enter Fourth Option \" required=\"\" class=\" text col-md-4\"><br><br>\r\n" + 
				"								<div class=\"form-group\">\r\n" + 
				"									<label for=\"canswer\" class=\"col-md-4\"><strong>Correct Option:</strong></label>\r\n" + 
				"									<label for=\"marks\" class=\"col-md-4\"><strong>Marks:</strong></label>\r\n" + 
				"								<input  type=\"text\" name=\"canswer\"  placeholder=\"Enter Correct Option \" required=\"\" class=\"text col-md-4\">\r\n" + 
				"								\r\n" + 
				"									\r\n" + 
				"								<input  type=\"text\" name=\"marks\"  placeholder=\"Enter Marks for Question \" required=\"\" class=\" text col-md-4\">\r\n" + 
				"								\r\n" + 
				"								\r\n" + 
				"								</div>\r\n" + 
				"									\r\n" + 
				"									<div class=\"form-group \" >\r\n" + 
				"									<input type=\"submit\" class=\"btn btn-danger form-control\" name=\"add_que\" value=\"Add Question\">\r\n" + 
				"									\r\n" + 
				"\r\n" + 
				"									</div>\r\n" + 
				"								</div>\r\n" + 
				"</div>\r\n" + 
				"							</div>\r\n" + 
				"							</div>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"					</div>\r\n" + 
				"		\r\n" + 
				"</form>\r\n" + 
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
		//String Que_no=request.getParameter("Que_no");
		String Que_name=request.getParameter("Que_name");
	
		String op1=request.getParameter("op1");
		String op2=request.getParameter("op2");
		String op3=request.getParameter("op3");
		String op4=request.getParameter("op4");
		String correct=request.getParameter("canswer");
		String marks=request.getParameter("marks");
		PrintWriter pw=response.getWriter();
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Quiz","root","");
			
			java.sql.Statement st=con.createStatement();
			String sql="INSERT INTO `add_que`(`que_name`, `op1`, `op2`, `op3`, `op4`, `correct`, `marks`) VALUES ('"+Que_name+"','"+op1+"','"+op2+"','"+op3+"','"+op4+"','"+correct+"','"+marks+"')";
			
			int rs=st.executeUpdate(sql);
			
			if(rs>0)
			{
				
				//pw.print("<script> alert('Question added Successfully');</script>");
				response.sendRedirect("Add_question");
				
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
