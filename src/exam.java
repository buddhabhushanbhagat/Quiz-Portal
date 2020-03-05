

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
 * Servlet implementation class exam
 */
@WebServlet("/exam")
public class exam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public exam() {
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
		 if(session.getAttribute("student")!=null)
		 {
			
		 }else
			 	if(session.getAttribute("admin")!=null) {
			 out.println("<script>window.location='Admin_home'</script>");
		 }else {
			 out.println("<script>window.location='Login'</script>");
		 }
		PrintWriter p1=response.getWriter();
		p1.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Get Started</title>\r\n" + 
				"</head>\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css\" integrity=\"sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B\" crossorigin=\"anonymous\">\r\n" + 
				"<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js\" integrity=\"sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em\" crossorigin=\"anonymous\"></script>\r\n" + 
				"\r\n" + 
				"<body style=\"background: #BC8F8F;\">\r\n" + 
				"<div class=\"container\">\r\n" + 
				"<div class=\"card mt-5\">\r\n" + 
				"	<p>\r\n" + 
				"	<center>******<strong>Instructions before Taking Quiz</strong>******</center>\r\n" + 
				"	<ul>\r\n" + 
				"	<li>Select an answer for every question. Unanswered questions will be scored as incorrect.</li>\r\n" + 
				"	<li>Multiple Choice: click the radio button to indicate your choice. Currently, only one       answer can be selected for a multiple choice question.</li>\r\n" + 
				"	<li>Click on the Submit button at the bottom of the page to have your answers graded.</li>\r\n" + 
				"</ul>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</p>\r\n" + 
				"</div>"+
				"<div class=\"row\">\r\n" + 
				"<div class=\"col-md-2 mx-auto mt-5\">\r\n" + 
				"<form action=\"exam\" method=\"post\">\r\n" + 
				"<input type=\"submit\" class=\"btn btn-primary\" value=\"Take a Quiz\">\r\n" + 
				"</form>\r\n" + 
				"</div>\r\n" + 
				"</div>\r\n" + 
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
		response.setContentType("text/html");
		String date=null;
		String time=null;
		String password=null;
        PrintWriter pw = response.getWriter();
        pw.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css\" integrity=\"sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B\" crossorigin=\"anonymous\">\r\n" + 
				"");
        pw.println("<html><body>");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/quiz", "root", "");
      			response.setContentType("text/html");
    			Statement st=con.createStatement();
    			String sql="select * from quiz_settings";
    			
    			
    			ResultSet rs=st.executeQuery(sql);
    			while(rs.next())
    			{
    				 date=rs.getString(1);
    				 time=rs.getString(2);
    				 password=rs.getString(3);
    			}
    			st.close();
    			con.close();			
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    		
    		
    		pw.println("<body style=\"background: #BC8F8F;\">\r\n" + 
    				"	<form method='post' action='Start_quiz'>\r\n" + 
    				"	<div class=\"container \">\r\n" + 
    				"		<div class=\"row mt-4 \">\r\n" + 
    				"			<div class=\"col-md-6 mx-auto\">\r\n" + 
    				"				<div class=\"card mx-auto\">\r\n" + 
    				"					<div class=\"card-header\"><h1>Start Quiz</h1></div>\r\n" + 
    				"					<div class=\"card-body\">\r\n" + 
    				"						<label>Date:\n"+date+"</label class=\"form-control\"><br>\r\n" + 
    				"						<label>Time:\n"+time+"min.</label class=\"form-control\"><br>\r\n" + 
    				"						<input type=\"password\" id=\"pass\" placeholder=\"Enter password\" name=\"pass\" class=\"form-control\" required=\"true\">\r\n" + 
    				"						<input type=\"submit\" id=\"submit\" name=\"submit\" class=\"form-control btn btn-danger mt-2\">\r\n" + 
    				"\r\n" + 
    				"					</div>\r\n" + 
    				"				</div>\r\n" + 
    				"		</div>\r\n" + 
    				"</form>\r\n" + 
    				"</body>");
    		
    		String password1=request.getParameter("pass");
    		if(password1.equals(password)) {
    			response.sendRedirect("Start_quiz");
    		}
    		else {
    			response.setContentType("text/html");
    			pw.print("<script>alert('Enter valid password');</script>");
    		}
	}

}
