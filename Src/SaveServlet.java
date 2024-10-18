import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/SaveServlet")  
public class SaveServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
         
        String id=request.getParameter("id");
        String name=request.getParameter("name");  
        String mobile=request.getParameter("mobile");  
        String email=request.getParameter("email");  
        String branch=request.getParameter("branch");  
          
        Student e=new Student(); 
        e.setId(Integer.parseInt(id));
        e.setName(name);  
        e.setMobile(mobile);  
        e.setEmail(email);  
        e.setBranch(branch);  
          
        int status=StudentDatabase.save(e);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("addstudent.html").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
    }  
  
}  