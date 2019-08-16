package br.com.senai.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "aluno")
@Entity
public class UsuariosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int alu_id;
	private String alu_nome;
	private String alu_senha;
	private Date alu_nascimento;
	private float alu_peso;
	private float alu_altura;
	private String alu_privilegio;
	
	public int getAlu_id() {
		return alu_id;
	}
	public void setAlu_id(int alu_id) {
		this.alu_id = alu_id;
	}
	public String getAlu_nome() {
		return alu_nome;
	}
	public void setAlu_nome(String alu_nome) {
		this.alu_nome = alu_nome;
	}
	public Date getAlu_nascimento() {
		return alu_nascimento;
	}
	public void setAlu_nascimento(Date alu_nascimento) {
		this.alu_nascimento = alu_nascimento;
	}
	public float getAlu_peso() {
		return alu_peso;
	}
	public void setAlu_peso(float alu_peso) {
		this.alu_peso = alu_peso;
	}
	public float getAlu_altura() {
		return alu_altura;
	}
	public void setAlu_altura(float alu_altura) {
		this.alu_altura = alu_altura;
	}
	public String getAlu_senha() {
		return alu_senha;
	}
	public void setAlu_senha(String alu_senha) {
		this.alu_senha = alu_senha;
	}
	public String getAlu_privilegio() {
		return alu_privilegio;
	}
	public void setAlu_privilegio(String alu_privilegio) {
		this.alu_privilegio = alu_privilegio;
	}
	
}
