package com.example.myapp;

import java.net.URI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import java.awt.Desktop;

@SpringBootApplication
public class MyappApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyappApplication.class, args);
		try {
            Thread.sleep(3000); // Chờ 3 giây để server khởi động xong
            Desktop.getDesktop().browse(new URI("http://localhost:8080/sach"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Cấu hình ViewResolver để Spring Boot tìm JSP trong WEB-INF/views/
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
