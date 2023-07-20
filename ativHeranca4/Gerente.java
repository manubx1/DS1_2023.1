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
public class Gerente extends CargoDeConfianca{

    //CONSTRUTOR
    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, ativHeranca4.Setor Setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, Setor, salarioBase, dataAdmissao);
    }

    //TO STRING

    @Override
    public String toString() {
        return "\n Gerente: "
                + super.toString();
    }

    @Override
    public double getSalarioFinal() {
       double salarioFinal = 0;
       salarioFinal += super.salarioBase * super.bonificacao.valor;
       salarioFinal += super.salarioBase;
       
       return salarioFinal;
    }
    
    
    
}
