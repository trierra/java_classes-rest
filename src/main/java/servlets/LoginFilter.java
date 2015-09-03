package servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by trierra on 8/26/15.
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    private FilterConfig filterConfig = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (filterConfig == null)
            return;

        String user = (String) filterConfig.getServletContext().getAttribute("login");
        if(user != null){
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        servletRequest.getRequestDispatcher("/login").forward(servletRequest, servletResponse);

    }

    public void destroy() {
        this.filterConfig = null;
    }
}
