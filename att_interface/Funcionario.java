/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package att_interface;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author DE BOA TURISMO
 */
public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected LocalDate dataNascimento;
    protected Genero genero;
    protected Setor setor;
    protected double SalarioBase;

    public Funcionario(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double SalarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.setor = setor;
        this.SalarioBase = SalarioBase;
    }

    public int getIdade(){
        return Period.between(dataNascimento,LocalDate.now()).getYears();
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

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    @Override
    public String toString() {
        return 
                "\n Nome: " + nome +
                "\n Data Nascimento: " + Util.formatarData(dataNascimento) + 
                "\n Genero: " + genero.getTexto() + 
                "\n Setor: " + setor.getNome() + 
                "\n Salario Base: " + Util.formatarValor(SalarioBase);
    }
    
    
    
}
