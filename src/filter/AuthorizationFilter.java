package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "AuthorizationFilter")
public class AuthorizationFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
       if (((HttpServletRequest)req).getSession().getAttribute("uname")== null){
           ((HttpServletResponse)resp).sendRedirect("login.xhtml");

       }else {

           chain.doFilter(req,resp);
       }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
