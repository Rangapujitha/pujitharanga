package com.loginreg.loginregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@ComponentScan({"com.loginreg"})
//@EnableCouchbaseRepositories(basePackages = {"com.loginreg"})
//@EnableEurekaClient
@SpringBootApplication
public class LoginregistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginregistrationApplication.class, args);
		System.out.println("hi chinnnu");
	}

}
