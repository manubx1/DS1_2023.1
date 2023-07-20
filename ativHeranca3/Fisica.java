/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativHeranca3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public class Fisica extends Pessoa{
    private Genero genero;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private double salario;

    public Fisica(Genero genero, String cpf, String rg, LocalDate dataNascimento, double salario, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.genero = genero;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    
}
    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return 
                super.toString() +
                "\n Genero: " + genero + 
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n Data Nascimento: " + dataNascimento + 
                "\n Salario; " + salario;
    }
     
    
}
