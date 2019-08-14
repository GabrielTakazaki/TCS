package br.com.senai.model;

public class UsuarioModel {
	private int id;
	private String nome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPrivilegios() {
		return privilegios;
	}
	public void setPrivilegios(String privilegios) {
		this.privilegios = privilegios;
	}
	private String senha;
	private String privilegios;
}
