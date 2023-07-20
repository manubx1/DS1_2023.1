/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package att_interface2;

/**
 *
 * @author Aluno
 */
public enum Setor {
    RH("Recursos Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES("Operacoes");
    
    protected String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
