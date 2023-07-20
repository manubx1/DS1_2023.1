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
public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String cnh, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "\n Motoboy " + 
                super.toString() +
                "\n CNH: " + cnh;
    }

    @Override
    public double getSalarioFinal() {
        return super.salario;
    }
    
    
    
}
