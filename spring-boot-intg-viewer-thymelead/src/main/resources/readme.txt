1, spring boot官方推荐方式
2, spring boot集成thymeleaf需要引入如下启动器：
	<!-- spring boot thymeleaf启动器 -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
	    <artifactId>spring-boot-starter-thymeleaf</artifactId>
	</dependency>
3，创建存放视图层的目录：
	spring boot集成thymeleaf时视图类的模板需要放在src/main/resources下的templates目录中
	此templates目录时安全的，不允许外部直接访问
	需要访问，则需要通过controller做视图定位跳转返回给客户端
4, thymeleaf是通过特定的语法对html的标记做渲染
	项目中使用thymelea做视图层开发时，则相应的技术可以选择html		
5, thymeleaf在做页面渲染时必须html语法规则严谨的遵守，即有开始必须有结束
	示例异常：
		org.xml.sax.SAXParseException: 元素类型 "meta" 必须由匹配的结束标记 "</meta>" 终止。
		案例参考:DemoExecpController及indexExecp.html
	解决方案：
		a, 对有没有结束标记的元素，添加一个结束标记
		b, 将依赖的thymeleaf核心的版本修改为3.0以上
			可以在pom添加如下配置
			<properties>
		  		<thymeleaf.version>3.0.2.RELEASE</thymeleaf.version>
		  		<thymeleaf-layout-dialect.version>2.0.4</thymeleaf-layout-dialect.version>
			</properties>
			参考示例：DemoExecpController及indexIgnoreTag.html
			
			
			
			
			
			