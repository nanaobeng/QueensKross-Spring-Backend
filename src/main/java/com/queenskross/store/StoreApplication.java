package com.queenskross.store;

import com.queenskross.store.Auth.model.Role;
import com.queenskross.store.Auth.model.User;
import com.queenskross.store.Auth.service.UserService;
import com.queenskross.store.Orders.Order.Order;
import com.queenskross.store.Orders.Order.OrderService;
import com.queenskross.store.Product.Model.Product;
import com.queenskross.store.Product.Service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
@CrossOrigin
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService, ProductService productService ) {
		return args -> {
			userService.saveRole(new Role(null,"CUSTOMER"));
			userService.saveRole(new Role(null,"ADMIN"));

			userService.saveUser(new User(null,"time","gbese","timgbese@gmail.com","test123","",new ArrayList<>()));
			userService.saveUser(new User(null,"nana","obeng","nanaobengmarnu@gmail.com","test1234","",new ArrayList<>()));

			userService.addRoleToUser("timgbese@gmail.com","CUSTOMER");
			userService.addRoleToUser("nanaobengmarnu@gmail.com","ADMIN");


		};
	}





}
