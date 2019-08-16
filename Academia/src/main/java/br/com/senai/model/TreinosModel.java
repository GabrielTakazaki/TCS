package br.com.senai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "treino")
@Entity
public class TreinosModel {
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int tre_id;
	private String tre_nome;
	private String tre_exercicios;
	
	public int getTre_id() {
		return tre_id;
	}
	public void setTre_id(int tre_id) {
		this.tre_id = tre_id;
	}
	public String getTre_nome() {
		return tre_nome;
	}
	public void setTre_nome(String tre_nome) {
		this.tre_nome = tre_nome;
	}
	public String getTre_exercicios() {
		return tre_exercicios;
	}
	public void setTre_exercicios(String tre_exercicios) {
		this.tre_exercicios = tre_exercicios;
	}
	
}
