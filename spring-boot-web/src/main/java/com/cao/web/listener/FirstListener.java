package com.cao.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * spring boot整合listener
 * 
 * web.xml配置
 * <listener>
 * 	<listener-class>com.cao.web.listener.FirstListener</listener-class>
 * </listener>
 * @author Cao
 *
 */
@WebListener
public class FirstListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("First listener init ...");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
