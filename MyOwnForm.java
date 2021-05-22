import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyOwnForm extends HttpServlet{

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		String name= req.getParameter("User_name");
		String fname= req.getParameter("User_Fname");
		String PostalAddress= req.getParameter("User_Pname");
		String PersonalAdd= req.getParameter("User_PerAddname");
		String gender= req.getParameter("User_gender");
		String city= req.getParameter("user_city");
		String course= req.getParameter("user_course");
		String Dist= req.getParameter("user_Dist");
		String state= req.getParameter("user_state");
		String pincode= req.getParameter("User_PinCode");
		String email= req.getParameter("User_email");
		String date= req.getParameter("User_date");
		String Mobnumber= req.getParameter("User_Mname");
		String cond= req.getParameter("condition");
		if(cond.equals("checked")) {
			out.println(name);
			out.println(fname);
			out.println(PostalAddress);
			out.println(PersonalAdd);
			out.println(gender);
			out.println(city);
			out.println(course);
			out.println(Dist);
			out.println(state);
			out.println(pincode);
			out.println(email);
			out.println(date);
			out.println(Mobnumber);
			
			
		}else {
			out.println("<h2>not satisfied</h2>");
		}
	}

	
}
