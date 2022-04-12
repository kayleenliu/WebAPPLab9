package filters;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

/**
 *
 * @author Kayleen
 */
public class AdminFilter implements Filter {
    

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        HttpServletResponse httpResponse = (HttpServletResponse)response;
        
        //check if the user is an admin or not.
        
        String email = (String)httpRequest.getSession().getAttribute("email");
        Integer roleId = (Integer)httpRequest.getSession().getAttribute("role");
        if(roleId == null){
            httpResponse.sendRedirect("login");
        }
        else if (roleId == 1){
            chain.doFilter(request, response);
        }
        else {
            httpResponse.sendRedirect("notes");
        }
        
        chain.doFilter(request, response);
       
    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {   
    }

    
    
}
