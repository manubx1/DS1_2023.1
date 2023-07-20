/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package att_interface;

/**
 *
 * @author DE BOA TURISMO
 */
public enum Setor {
    RH ("Recursos Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES("Operacoes");
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
