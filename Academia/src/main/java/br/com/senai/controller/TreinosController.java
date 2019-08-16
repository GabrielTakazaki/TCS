package br.com.senai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.senai.dao.TreinosDAO;
import br.com.senai.model.TreinosModel;

@Controller
public class TreinosController {
	@Autowired
	private TreinosDAO treinoDAO;
	@RequestMapping("/formulario/treino")
	public String cadastroTreino () {
		System.out.println("Cadastrando treino...");
		return "/formulario/treino";
	}
	@RequestMapping("/formulario/salvatreino")
	public String save (TreinosModel treino) {
		treinoDAO.save(treino);
		return "formulario/cadastrado";
	}
}
