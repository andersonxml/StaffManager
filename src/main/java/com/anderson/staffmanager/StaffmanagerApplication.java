package com.anderson.staffmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StaffmanagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(StaffmanagerApplication.class, args);

		System.out.println("================================");
		System.out.println(" ");
		System.out.println("Staffmanager Application Started");
		System.out.println(" ");
		System.out.println("================================");
	}
}
