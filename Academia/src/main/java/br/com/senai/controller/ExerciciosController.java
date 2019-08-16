package br.com.senai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.senai.dao.ExerciciosDAO;
import br.com.senai.model.ExerciciosModel;

@Controller
public class ExerciciosController {
	@Autowired
	private ExerciciosDAO exerciciosDAO;
	@RequestMapping("/formulario/exercicio")
	public String cadastroExercicio () {
		System.out.println("Cadastrando exercicio...");
		return "/formulario/exercicio";
	}
	@RequestMapping("/formulario/salvaexercicio")
	public String save (ExerciciosModel exercicio) {
		exerciciosDAO.save(exercicio);
		return "formulario/cadastrado";
	}
}
