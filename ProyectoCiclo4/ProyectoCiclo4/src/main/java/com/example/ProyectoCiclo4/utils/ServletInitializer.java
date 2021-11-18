package com.example.ProyectoCiclo4.utils;

import com.example.ProyectoCiclo4.ProyectoCiclo4Application;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProyectoCiclo4Application.class);
	}

}
