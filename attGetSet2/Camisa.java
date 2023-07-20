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
public class Camisa {
    private String marca;
    private String cor;
     private double preço;
    private String tamanho;

    public Camisa(String marca, String cor, double preço, String tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.preço = preço;
        this.tamanho = tamanho;
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

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
   
   
    
}
