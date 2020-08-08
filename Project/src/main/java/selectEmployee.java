


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.hibernate.app.App;
import com.wipro.hibernate.bean.Employee;

/**
 * Servlet implementation class selectEmployee
 */
@WebServlet("selectEmployee")
public class selectEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id = -1;
		HttpSession session =request.getSession();
		if (session.getAttribute("id") != null) {
			id = (Integer) session.getAttribute("id");
		}

		else {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Login Please');");
			out.println("location='index.jsp';");
			out.println("</script>");
		}
		
		int eId=Integer.parseInt(request.getParameter("id"));
		Employee emp=new App().selectEmployee(eId);
		
		if(emp==null) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Employee does not exist');");
			out.println("location='select_employee.jsp';");
			out.println("</script>");
		}
		
		response.getWriter().println(emp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
