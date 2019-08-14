package br.com.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {
	@RequestMapping("/products/form")
	public String cadastroUsuario () {
		System.out.println("Cadastrando");
		return "/products/form";
	}
}
