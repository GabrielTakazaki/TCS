package br.com.senai.model;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "categoria")
@Entity
public class CategoriaModel {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cat_id;
	private String cat_nome;
	private String cat_descricao;
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_nome() {
		return cat_nome;
	}
	public void setCat_nome(String cat_nome) {
		this.cat_nome = cat_nome;
	}
	public String getCat_descricao() {
		return cat_descricao;
	}
	public void setCat_descricao(String cat_descricao) {
		this.cat_descricao = cat_descricao;
	}
	
}