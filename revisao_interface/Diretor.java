/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao_interface;

import java.time.LocalDate;

/**
 *
 * @author DE BOA TURISMO
 */
public class Diretor extends Funcionario implements Contratacao{
    
    private double PREMIO = 0.2;

    public Diretor(String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return  
                "\n Diretor " + 
                super.toString() +
                "\n Premio: " + (PREMIO*100) + "%" +
                "\n Salario final: " + Util.formatarMonetario(getSalarioFinal());
        
               
        
                  
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario a baixo: " + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionario a baixo: " + funcionario);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
       salarioFinal = super.salario * PREMIO;
       salarioFinal += super.salario;
       return salarioFinal;
    }
    
    
}
