import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet { 
  protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
    // reading the user input
    String color= request.getParameter("FirstName");    
    PrintWriter out = response.getWriter();
    out.println ("<html><body><h1>Hello Zulfi</h1></body</html");  
  }  
}