package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Student;

public final class b_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>THDC-IHET-2019</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"greenyellow\">\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   ");

       // lets get the object of bean from session object
       
       Student p=(Student)session.getAttribute("rps");
   
    // lets fetch the data from beans object using getter method
    
    String name=p.getName();
    String fname=p.getFname();
    String address=p.getAddress();
    String city=p.getCity();
    String state=p.getState();
    String sex=p.getSex();
    String email=p.getEmail();
    String subject1=p.getSubject1();
    String ubord1=p.getUbord1();
    String hpersent=p.getHpersent();
    String hyear=p.getHyear();
    String subject2=p.getSubject2();
    String ubord2=p.getUbord2();
    String ipersent=p.getIpersent();
    String iyear=p.getIyear();
    
    
   
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   <fieldset>\r\n");
      out.write("   <legend><h3>Personal Information</h3></legend>\r\n");
      out.write("   <table>\r\n");
      out.write("   <tr><td>Name:</td>&nbsp<td>");
      out.print(name);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>Father Name:</td>&nbsp<td>");
      out.print(fname);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>Address:</td>&nbsp<td>");
      out.print(address);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>City:</td>&nbsp<td>");
      out.print(city);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>State:</td>&nbsp<td>");
      out.print(state);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>Sex:</td>&nbsp<td>");
      out.print(sex);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>E-mail:</td>&nbsp<td>");
      out.print(email);
      out.write("</td></tr>\r\n");
      out.write("   </table>\r\n");
      out.write("   </fieldset><br>\r\n");
      out.write("   <div>\r\n");
      out.write("   <fieldset>\r\n");
      out.write("  <legend><h3>Professional Information</h3></legend>\r\n");
      out.write("   <table>\r\n");
      out.write("   <tr><td>H.School Subject:</td>&nbsp<td>");
      out.print(subject1);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>H.School Board:</td>&nbsp<td>");
      out.print(ubord1);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>10th Marks(%):</td>&nbsp<td>");
      out.print(hpersent);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>10th Passed Year:</td>&nbsp<td>");
      out.print(hyear);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>Inter Subject:</td>&nbsp<td>");
      out.print(subject2);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>Inter Board:</td>&nbsp<td>");
      out.print(ubord2);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>12th Marks(%):</td>&nbsp<td>");
      out.print(ipersent);
      out.write("</td></tr>\r\n");
      out.write("   <tr><td>12th Passed Year:</td>&nbsp<td>");
      out.print(iyear);
      out.write("</td></tr>\r\n");
      out.write("   \r\n");
      out.write("   </table>\r\n");
      out.write("   </fieldset>\r\n");
      out.write("   </div>\r\n");
      out.write("   <br>\r\n");
      out.write("   <br>\r\n");
      out.write("   <input type=\"submit\" value=\"Print\">&nbsp &nbsp<a href=\"studentfee.html\">Fee Submit</a>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write(" \r\n");
      out.write("   </table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
