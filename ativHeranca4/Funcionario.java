/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativHeranca4;

import java.time.LocalDate;

/**
 *
 * @author manu
 */
public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Genero genero;
    protected Setor Setor;
    protected double salarioBase;
    protected LocalDate dataAdmissao;

//CONSTRUTOR

    public Funcionario(String nome, String cpf, String rg, Genero genero, Setor Setor, double salarioBase, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.Setor = Setor;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }
    
    //GETTER SALARIO FINAL
    
    public abstract double getSalarioFinal();

    //GETTER E SETTER

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return Setor;
    }

    public void setSetor(Setor Setor) {
        this.Setor = Setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    //TO STRING
    @Override
    public String toString() {
        return "\n Nome: " + nome + 
                "\n CPF: " + cpf + 
                "\n RH: " + rg + 
                "\n Gênero: " + genero.texto + 
                "\n Setor: " + Setor.nome +
                "\n Salario Base: " + salarioBase + 
                "\n Data Admissao: " + dataAdmissao;
    }
    
    
    
}
