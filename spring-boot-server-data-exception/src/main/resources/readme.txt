spring boot 基于hibernate中的validate实现

实现校验步骤：

1， 在对应需要校验的实体添加相应的校验规则的注解
	@Valid 开启对Users对象的数据校验
	BindingResult:封装了校验的结果
	添加了Valid的实体校验不合法时，实体对象会被spring mvc将实体的参数反正ModelAndView对象中。
	放在ModelAndView中的时候的addAttribute中的Key会该对象的驼峰式命令作为Key（spring管理对象中没给默认名字时spring管理对象的命令规则方式）。
2， 异常示例
	a， Neither BindingResult nor plain target object for bean name 'users' available as request attribute
		解决方式 1:
			可以在跳转页面的方法中注入一个users对象，由于spring mvc会将该对象放在Model中传递，所以model中addAttribute中的Key会使用该对象的驼峰式的命名规则作为key，
			参数名称需要与对象名称相同，首字母小写
		参考示例：UserExcepController
		解决方式2：可以给Model中传递的对象更改名称，可以使用@ModelAttribute("aa")，表示当前传递的对象的key时aa，那么在也面中获取该对象的key时也需要修改为“aa”
		参考示例：UserExcep2Controller
2， 检验注解
	@NotBlank: 判断字符是否为Null或者是空串（去掉首尾空格）
	@NotEmpty：判断字符是否为Null或者是空串（不去掉首尾空格）
	@Length: 判断字符的长度（最大或最小）， @Length(min=2,max=6,message="最小长度为2位，最大长度为6位")
	@Min:一般用于判断整数的最小值， @Min(value=15)
	@Max:一般用于判断整数的最大值
	@Email:判断邮箱是否合法， @Email()
	