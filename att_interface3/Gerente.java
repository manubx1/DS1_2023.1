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
public class Gerente extends CargoDeConfianca implements Autentificavel{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, genero, salarioBase, dataNascimento);
    }

    @Override
    public String toString() {
        return "\n Gerente " +
                super.toString() +
                "\n Salario final: " + Util.formatarDinheiro(getSalarioFinal());

    }

    @Override
    public double getSalarioFinal() {    
        return salarioBase + salarioBase *Bonificacao.GERENTE.getValor();

    }
    
    
}
