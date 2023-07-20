/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attGetSet2;

/**
 *
 * @author Aluno
 */
public class Sapato {
     private String marca;
    private String cor;
    private String tamanho;
    private double preço;

    public Sapato(String marca, String cor, String tamanho, double preço) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preço = preço;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

 
    
    
}
