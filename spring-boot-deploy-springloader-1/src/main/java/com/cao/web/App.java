package com.cao.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 启动时在run as - run configuration - Arguments输入如下启动命令：
 * -javaagent:.\lib\springloaded-1.2.5.RELEASE.jar -noverify
 * @author Cao
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
