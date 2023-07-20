/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package att_interface2;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */

public class Diretor extends Funcionario implements Contratacao{
    public static void main(String[] args) {
        
    }

    private final double PREMIO = 0.2;

    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salariobase) {
        super(nome, dataNascimento, genero, setor, salariobase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salariobase * this.PREMIO;
        salarioFinal += super.salariobase;
       return salarioFinal;
 }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario: " + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario: " + funcionario);
    }
  
     @Override
    public String toString() {
        return super.toString() + 
               "\n Premio: " +(PREMIO*100) + "%" +
                "\n Salario final: " + Util.formatarDinheiro(getSalarioFinal());
}
}