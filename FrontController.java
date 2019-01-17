package in.co.sunrays.proj4.controller;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.sunrays.proj4.util.ServletUtility;

/**
 * Main Controller performs session checking and logging operations before
 * calling any application controller. It prevents any user to access
 * application without login.
 * 
 * 
 * @author Factory
 * @version 1.0
 * @Copyright (c) SunilOS
 */
@WebFilter(filterName = "FrontController", urlPatterns = { "/ctl/*", "/doc/*" })
public class FrontController implements Filter {

	/**
	 * Default constructor.
	 */
	public FrontController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession(true);
		if (session.getAttribute("user") == null) {
			req.setAttribute("message", "Session Expired...Please Re.Login");
			
		/*//String path = ((HttpServletRequest) request).getRequestURI().substring(((HttpServletRequest) request).getContextPath().length());
			
			String path = req.getRequestURI();
			req.setAttribute("uri", path);*/
			//System.out.println(path);
			 
			 String[] uri = req.getRequestURI().replaceAll(req.getContextPath(), "").split("\\/");   
			 req.setAttribute("uri", uri);
			 System.out.println("path"+uri);
			ServletUtility.forward(ORSView.LOGIN_VIEW, req, res);

		} else {
			chain.doFilter(request, response);
		}
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}
