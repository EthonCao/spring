package com.cao.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 通过spring boot注解的方式整合servlet
 * @author Cao
 *
 */
@SpringBootApplication
@ServletComponentScan //SpringBoot工程启动时会自动扫描@WebServlet
public class FirstApp {
	public static void main(String[] args) {
		SpringApplication.run(FirstApp.class, args);
	}
}
