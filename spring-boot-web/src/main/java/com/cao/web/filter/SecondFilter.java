package com.cao.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Second filter init ............");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Second filter do filter ......in......");
		chain.doFilter(request, response);
		System.out.println("Second filter do filter ......out......");
		
	}

	@Override
	public void destroy() {
		System.out.println("Second filter destory ............");
	}

}
