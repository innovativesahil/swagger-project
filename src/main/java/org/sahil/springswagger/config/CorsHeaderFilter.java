package org.sahil.springswagger.config;

import org.apache.catalina.filters.RequestFilter;
import org.apache.juli.logging.Log;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
public class CorsHeaderFilter extends RequestFilter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse res = (HttpServletResponse) response;
		HttpServletRequest req = (HttpServletRequest) request;
		res.setHeader("Access-Control-Allow-Origin", "*");
		chain.doFilter(req, res);
	}

	@Override
	protected Log getLogger() {
		return null;
	}
}
