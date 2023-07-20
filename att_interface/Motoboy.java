/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package att_interface;

import java.time.LocalDate;

/**
 *
 * @author DE BOA TURISMO
 */
public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String cnh, String nome, LocalDate dataNascimento, Genero genero, Setor setor, double SalarioBase) {
        super(nome, dataNascimento, genero, setor, SalarioBase);
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
        return "\n Motoboy  " + 
                super.toString() +
                "\n CNH: " + cnh +
                "\n Premio: 0%" +
                "\n Salario final: " + Util.formatarValor(SalarioBase);
        
    }

    @Override
    public double getSalarioFinal() {
        return SalarioBase;
    }
    
    
}
