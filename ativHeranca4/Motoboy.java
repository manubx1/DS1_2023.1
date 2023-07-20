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
public class Motoboy extends Funcionario{
    
    private String placaDaMoto;

    //CONSTRUTOR

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, ativHeranca4.Setor Setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, Setor, salarioBase, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }
     
    //GETTER E SETTER

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
                "\n Placa da moto: " + placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }


    }
    
    

