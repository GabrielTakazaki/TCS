package br.com.senai.config;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.senai.controller.HomeController;
import br.com.senai.dao.*;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class,CategoriaDAO.class, UsuariosDAO.class, ExerciciosDAO.class, TreinosDAO.class})
public class AppWebServletConfiguration {
	@Bean
	public InternalResourceViewResolver InternalResourceViewResolver () {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
