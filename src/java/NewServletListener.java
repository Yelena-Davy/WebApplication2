import java.io.File;
 
import java.io.File;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
 
import org.apache.log4j.PropertyConfigurator;


/**
 *
 * @author Yelena
 */
@WebListener("application context listener")
public class NewServletListener implements ServletContextListener {
 
    @Override
    public void contextInitialized(ServletContextEvent event) {
        // code to initialize log4j here...
        // initialize log4j here
        ServletContext context = event.getServletContext();
        String log4jConfigFile = context.getInitParameter("log4j-config-location");
        String fullPath = context.getRealPath("") + File.separator + log4jConfigFile;
         
        PropertyConfigurator.configure(fullPath);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
