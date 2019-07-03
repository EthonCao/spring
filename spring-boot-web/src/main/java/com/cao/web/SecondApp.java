package com.cao.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.cao.web.filter.SecondFilter;
import com.cao.web.servlet.SecondServlet;

/**
 * 通过方法的方式整合servlet
 * @author Cao
 *
 */

@SpringBootApplication
public class SecondApp {
	public static void main(String[] args) {
		SpringApplication.run(SecondApp.class, args);
	}
	
	/**
	 * 获取servlet
	 * @return
	 */
	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SecondServlet());
		servletRegistrationBean.addUrlMappings("/secondServlet");
		return servletRegistrationBean;
	}
	
	/**
	 * 获取filter
	 * @return
	 */
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecondFilter());
		filterRegistrationBean.addUrlPatterns("/secondFilter");
		return filterRegistrationBean;
	}
	
}
