package com.sinosoft.ap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@MapperScan("com.sinosoft.ap.system.*.domain")
public class ApSystemApplication {

	/**
	 * 说明：springboot程序启动:初始化Spring环境及组件,启动嵌入式的Tomcat
	 * @param args
	 */
	public static void main(String[] args) {
//        System.setProperty("spring.devtools.restart.enabled", "true");
	    SpringApplication.run(ApSystemApplication.class, args);
	}
}
