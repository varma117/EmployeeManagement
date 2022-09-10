package com.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.book","com.reader"})
public class ReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReaderApplication.class, args);
	}

}
