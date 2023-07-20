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
public class Diretor extends CargoDeConfianca{
    
    private final double PREMIO = 0.1;

    //contrutor
    public Diretor(Bonificacao bonificacao, String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, genero, salarioBase, dataNascimento);
    }

    //getter 
    public double getPREMIO() {
        return PREMIO;
    }

    //to string 
    @Override
    public String toString() {
        return "\n Diretor " + 
                super.toString() +
                "\n Premio: " + PREMIO +
                "\n Salario final: " + Util.formatarDinheiro(getSalarioFinal());
        
    }

    //abstratos
    @Override
    public double getSalarioFinal() {
        return salarioBase + salarioBase * PREMIO + salarioBase*Bonificacao.DIRETOR.getValor();
    }
    
    
}
