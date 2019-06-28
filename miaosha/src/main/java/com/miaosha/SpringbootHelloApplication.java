package com.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
//@Controller
@MapperScan("com.miaosha.mapper")//为mapper接口创建代理对象
public class SpringbootHelloApplication {

	public static void main(String[] args) {
		System.out.println("hello miaosha");
		SpringApplication.run(SpringbootHelloApplication.class, args);
	}

/*	@RequestMapping("/")
	@ResponseBody
	 public String home() {
		 return "lijinwei";
	 }*/
	
	//111111111111111111111
	//333333333333333333333
	//222222222222222222222
	//55555555555555555555555555
	//77777777777777777777777777黎锦威
}
