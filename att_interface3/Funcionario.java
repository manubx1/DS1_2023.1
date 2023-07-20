
package att_interface3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author DE BOA TURISMO
 */
public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected Genero genero;
    protected double salarioBase;
    protected LocalDate dataNascimento;

    public Funcionario(String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
    }

    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return 
                "\n Nome: " + nome + 
                "\n CPF: " + cpf + 
                "\n Genero: " + genero +
                "\n Data de nascimento: " + Util.formatarData(dataNascimento) +
                "\n Idade: " + getIdade()+
                "\n Salario Base: " + Util.formatarDinheiro(salarioBase);
    }
    
    
}
