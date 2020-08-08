
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
 * Servlet implementation class addEmployee
 */
@WebServlet("addEmployee")
public class addEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		int id = -1;
		HttpSession session = request.getSession();
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

		String Name = request.getParameter("Name");
		String Gender = request.getParameter("Gender");
		String Designation = request.getParameter("Designation");
		String City = request.getParameter("City");
		double Salary = Double.parseDouble(request.getParameter("Salary"));
		String EmailId = request.getParameter("EmailId");
		String MobileNo = request.getParameter("MobileNo");

		Employee emp = new Employee();

		emp.setCity(City);
		emp.setDesignation(Designation);
		emp.setEmailId(EmailId);
		emp.setGender(Gender);
		emp.setMobileNo(MobileNo);
		emp.setName(Name);
		emp.setSalary(Salary);

		new App().addEmployee(emp);

		PrintWriter out = response.getWriter();
		out.println("<script type=\"text/javascript\">");
		out.println("alert('New Employee Added');");
		out.println("location='main.jsp';");
		out.println("</script>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
