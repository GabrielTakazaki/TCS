package br.com.senai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.senai.controller.HomeController;
import br.com.senai.controller.UsuarioController;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class, UsuarioController.class})
public class AppWebServletConfiguration {
	@Bean
	public InternalResourceViewResolver InternalResourceViewResolver () {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
