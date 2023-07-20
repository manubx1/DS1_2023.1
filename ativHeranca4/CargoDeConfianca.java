/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativHeranca4;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfianca extends Funcionario{
    
    protected Bonificacao bonificacao;

    //CONSTRUTOR
    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, ativHeranca4.Setor Setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, Setor, salarioBase, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    //GETTER E SETTER
    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

//TO STRING
    
    @Override
    public String toString() {
        return super.toString() +
                "\n Bonificacao: " + bonificacao.valor;
    }
    
    
}
