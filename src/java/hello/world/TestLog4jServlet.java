/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.log4j.Logger;
 
@WebServlet("/test")
public class TestLog4jServlet extends HttpServlet {
 
    static final Logger LOGGER = Logger.getLogger(TestLog4jServlet.class); 
             
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        LOGGER.info("This is a logging statement from log4j");
         
        String html = "<html><h2>Log4j has been initialized successfully!</h2></html>";
        response.getWriter().println(html);
    }
 

}
