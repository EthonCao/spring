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
6, thymeleaf的变量输出与字符串操作
	a, th:text 作用是在页面输出某个值
	b, th:value 作用是可以将一个值放入到input标签的value中
	c, ${#strings.isEmpty(key)}: 判断字符串key是否为空，空则返回trule，否则返回false
		实现原理时thymeleaf的一个内置对象Strings的方法isEmpty()
		调用内置对象语法：
			调用内置对象一定要用 #
			大部分的内置对象都以s结尾: strings, numbers, dates
	d, ${#strings.contains(msg,'9')} 作用是判断当前字符串msg是否包含9， 包含则返回trule，否则返回false
	e, ${#strings.startsWith(msg,'a')}作用是判断当前字符串msg是否以a开头
	f, ${#strings.endsWith(msg,'a')} 作用是判断当前字符串是否是以a结尾
	g, ${#strings.length(msg)} 作用是计算字符串msg的长度
	h, ${#strings.indexOf(msg,'h')} 作用是查找当前字符串msg的子串h的位置
	i, ${#strings.substring(msg,13)} 作用是从位置13开始截取字符串msg
	   ${#strings.substring(msg,13,14)} 作用是从位置13开始截取字符串并在卫视14结束
	k, ${#strings.toUpperCase(msg)}
	   ${#strings.toLowerCase(msg)}   作用是将当前字符串msg转换为大/小写
	参考示例：DemoStringHandleHandleController及indexStringHandle.html			
			
			
			
			
			
			