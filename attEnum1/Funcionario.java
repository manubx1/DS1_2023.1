/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attEnum1;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private double salario;
    private Genero genero;
    private Setor setor;

    public Funcionario(int id, String nome, int idade, double salario, Genero genero, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.genero = genero;
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
    
    
}
