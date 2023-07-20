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
public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String placaDaMoto, String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento) {
        super(nome, cpf, genero, salarioBase, dataNascimento);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "\n Motoboy: " + 
                super.toString() +
                "\n placaDaMoto: " + placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }
    
    
}
