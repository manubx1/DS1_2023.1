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
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(33, "Margarida", 33, 33.333d, Genero.FEMININO, Setor.RH);
        
        
        System.out.println("Nome: " +funcionario.getNome());
        System.out.println("ID: " +funcionario.getId());
        System.out.println("Genero: " +funcionario.getGenero().getTexto());
        System.out.println("Idade: " +funcionario.getIdade());
        System.out.println("Setor: " +funcionario.getSetor().getNome());
        System.out.println("Salario: " +funcionario.getSalario());
        
    }
}
