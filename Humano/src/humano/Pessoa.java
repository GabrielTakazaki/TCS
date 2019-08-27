/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humano;

/**
 *
 * @author senai
 */
public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float velocidade;
    private boolean andando;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the andando
     */
    public boolean isAndando() {
        return andando;
    }

    /**
     * @param andando the andando to set
     */
    public void setAndando(boolean andando) {
        this.andando = andando;
    }

    /**
     * @return the velocidade
     */
    public float getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

}
