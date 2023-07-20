/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativHeranca4;

/**
 *
 * @author manu
 */
public enum Setor {
    ENGENHARIA ("Engenharia"),
    SAUDE ("Saúde"),
    JURIDICO ("Jurídico"),
    FINANCEIRO("Financeiro"),
    RH("Recursos Humanos"),
    ADMINISTRATIVO("Administrativo"),
    OPERACOES("Operações");
    
    protected final String nome;

 //CONSTRUTOR

    private Setor(String nome) {
        this.nome = nome;
    }
    
 //GETTER
    
    public String getNome() {
        return nome;
    }


}
