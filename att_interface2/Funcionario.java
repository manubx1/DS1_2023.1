/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package att_interface2;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected LocalDate dataNascimento;
    protected Genero genero;
    protected Setor setor;
    protected double salariobase;

    public Funcionario(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salariobase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.setor = setor;
        this.salariobase = salariobase;
    }
    
    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    @Override
    public String toString() {
        return "\n Funcionario: " + 
                "\n Nome:" + nome + 
                "\n Idade: " + this.getIdade() +
                "\n DataNascimento: " + Util.formatarData(dataNascimento) + 
                "\n Genero: " + genero.texto + 
                "\n Setor: " + setor.nome + 
                "\n Salario base: " + Util.formatarDinheiro(salariobase);
    }
    
    
}
