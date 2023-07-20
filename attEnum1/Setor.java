/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attEnum1;

/**
 *
 * @author Aluno
 */
public enum Setor {
    FINANCEIRO("financeiro"),
    RH("Recursos Humanos"),
    VENDAS("Vendas"), 
    MARKETING("Marketing");
    
   private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
   
}
