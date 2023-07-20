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
public class Produto {
    private Camisa camisa;
    private Calça calça;
    private Sapato sapato;

    public Produto(Camisa camisa, Calça calça, Sapato sapato) {
        this.camisa = camisa;
        this.calça = calça;
        this.sapato = sapato;
    }

    public Camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    public Calça getCalça() {
        return calça;
    }

    public void setCalça(Calça calça) {
        this.calça = calça;
    }

    public Sapato getSapato() {
        return sapato;
    }

    public void setSapato(Sapato sapato) {
        this.sapato = sapato;
    }
 
    
    
}
