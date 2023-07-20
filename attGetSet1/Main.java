/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attGetSet1;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
    Livro book = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 578924947, 96, 20);
    Veiculo car = new Veiculo(998899, "Grafite", 5, 100 , 150, 6);
    
         System.out.println("Tílulo: " + book.getTítulo());
         System.out.println("Autor: " + book.getAutor());
         System.out.println("ISBN: " + book.getISBN());
         System.out.println("Número de páginas: " + book.getNpagina());
         System.out.println("Preço: " + book.getPreço());
         
         System.out.println("                          ");
         
         System.out.println("Placa: " + car.getPlaca());
         System.out.println("Cor: " + car.getCor());
         System.out.println("Tanque: " + car.getTanque());
         System.out.println("Máxima de velocidade: " + car.getVelocidade());
         System.out.println("Média de consumo por km: " + car.getConsumom());
         
    }

}
