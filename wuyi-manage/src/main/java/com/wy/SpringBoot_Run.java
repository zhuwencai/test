package com.wy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.wy.manage.mapper")
public class SpringBoot_Run {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBoot_Run.class, args);
	}

}
