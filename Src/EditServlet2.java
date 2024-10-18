import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditServlet2")  
public class EditServlet2 extends HttpServlet {  
    
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String name=request.getParameter("name");  
        String mobile=request.getParameter("mobile");  
        String email=request.getParameter("email");  
        String branch=request.getParameter("branch");  
          
        Student e=new Student();  
        e.setId(id);  
        e.setName(name);  
        e.setMobile(mobile);  
        e.setEmail(email);  
        e.setBranch(branch);  
          
        int status=StudentDatabase.update(e);  
        if(status>0){  
            response.sendRedirect("ViewServlet");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  