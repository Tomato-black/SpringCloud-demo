package com.cz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tcmap.mapper")
public class TestApplication{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestApplication.class, args);
	}

}
