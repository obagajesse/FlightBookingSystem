package com.obagajesse.BookingFlightSystem1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.obagajesse.BookingFlightSystem1")
public class BookingFlightSystem1Application {

    public static void main(String[] args) {
        SpringApplication.run(BookingFlightSystem1Application.class, args);
    }
}
