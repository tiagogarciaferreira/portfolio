package com.tgfcodes.portfolio.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tgfcodes.portifolio.*"})
public class PortfolioApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PortfolioApplication.class);
	}

}
