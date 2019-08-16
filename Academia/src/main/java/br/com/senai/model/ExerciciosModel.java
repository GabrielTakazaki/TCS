package br.com.senai.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "exercicio")
@Entity
public class ExerciciosModel {
	@Id	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int exe_id;
	private String exe_nome;
	private String exe_descricao;
	private String exe_categoria;
	
	public int getExe_id() {
		return exe_id;
	}
	public void setExe_id(int exe_id) {
		this.exe_id = exe_id;
	}
	public String getExe_nome() {
		return exe_nome;
	}
	public void setExe_nome(String exe_nome) {
		this.exe_nome = exe_nome;
	}
	public String getExe_descricao() {
		return exe_descricao;
	}
	public void setExe_descricao(String exe_descricao) {
		this.exe_descricao = exe_descricao;
	}
	public String getExe_categoria() {
		return exe_categoria;
	}
	public void setExe_categoria(String exe_categoria) {
		this.exe_categoria = exe_categoria;
	}
	
}
