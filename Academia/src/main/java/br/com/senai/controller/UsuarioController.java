package br.com.senai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.senai.dao.UsuariosDAO;
import br.com.senai.model.UsuariosModel;

@Controller
public class UsuarioController {
	@Autowired
	private UsuariosDAO usuariosDAO;
	@RequestMapping("/formulario/usuario")
	public String cadastroUsuario () {
		System.out.println("Cadastrando");
		return "/formulario/usuario";
	}
	@RequestMapping("/formulario") 
	public String save (UsuariosModel usuario) {
		usuariosDAO.save(usuario);
		return "formulario/cadastrado";
	}
}