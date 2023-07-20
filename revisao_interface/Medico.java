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
public class Medico extends Funcionario{
    private String CRM;

    public Medico(String CRM, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.CRM = CRM;
    }

   

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    @Override
    public String toString() {
        return "\n Medico " + 
                super.toString() +
                "CRM: " + CRM;
    }

    @Override
    public double getSalarioFinal() {
        return super.salario;
    }
    
    
}
