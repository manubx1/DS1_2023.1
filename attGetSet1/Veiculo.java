/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attGetSet1;

/**
 *
 * @author Aluno
 */
public class Veiculo {
    private float placa; 
    private String cor; 
    private int npassageiro; 
    private float tanque; 
    private float velocidade; 
    private float consumom; 

    public Veiculo(float placa, String cor, int npassageiro, float tanque, float velocidade, float consumom) {
        this.placa = placa;
        this.cor = cor;
        this.npassageiro = npassageiro;
        this.tanque = tanque;
        this.velocidade = velocidade;
        this.consumom = consumom;
        
    }

    public float getPlaca() {
        return placa;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNpassageiro() {
        return npassageiro;
    }

    public void setNpassageiro(int npassageiro) {
        this.npassageiro = npassageiro;
    }

    public float getTanque() {
        return tanque;
    }

    public void setTanque(float tanque) {
        this.tanque = tanque;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getConsumom() {
        return consumom;
    }

    public void setConsumom(float consumom) {
        this.consumom = consumom;
    }
   
    
}
