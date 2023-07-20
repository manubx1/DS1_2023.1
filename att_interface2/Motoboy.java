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
public class Motoboy extends Funcionario{

    private String cnh;

    public Motoboy(String carteiraDeHabilitacao, String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salariobase) {
        super(nome, dataNascimento, genero, setor, salariobase);
        this.cnh = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return cnh;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.cnh = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return  super.toString() +
               "\n Carteira De Habilitacao: " + cnh +
                "\n Salario final: " + Util.formatarDinheiro(getSalarioFinal());
    }

    
    @Override
    public double getSalarioFinal() {
        return super.salariobase;
    }
    
}
