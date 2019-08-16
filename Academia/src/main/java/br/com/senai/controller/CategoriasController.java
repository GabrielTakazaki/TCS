package br.com.senai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.senai.dao.CategoriaDAO;
import br.com.senai.model.CategoriaModel;

@Controller
public class CategoriasController {
	@Autowired
	private CategoriaDAO categoriaDAO;
	@RequestMapping("/formulario/categoria")
	public String cadastroCategoria () {
		System.out.println("Cadastrando categoria...");
		return "/formulario/categoria";
	}
	@RequestMapping("/formulario/salvacategoria")
	public String save (CategoriaModel categoria) {
		categoriaDAO.save(categoria);
		return "formulario/cadastrado";
	}
	
}
