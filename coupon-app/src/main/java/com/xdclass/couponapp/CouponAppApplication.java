package com.xdclass.couponapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xdclass.couponapp.mapper")
public class CouponAppApplication {

	public static void main(String[] args) {
		System.out.println("第一次修改，我再提交就冲突了aaa1222");
		System.out.println("第一次修改dd，我再提交就冲突了bbddb1222");
		System.out.println("第一次修改dddd,我在这修改会冲突1222");
		SpringApplication.run(CouponAppApplication.class, args);
	}

}
