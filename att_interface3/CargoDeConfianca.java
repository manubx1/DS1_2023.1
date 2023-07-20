/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package att_interface3;

import java.time.LocalDate;

/**
 *
 * @author DE BOA TURISMO
 */
public abstract class CargoDeConfianca extends Funcionario {
    protected  Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento) {
        super(nome, cpf, genero, salarioBase, dataNascimento);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "\n Titulado: Cargo de confianca " + 
                super.toString() +
                "\n Bonificacao: " + bonificacao.getValor();
    }

    
    
}
