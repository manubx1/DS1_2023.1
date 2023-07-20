/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attGetSet2;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
      Camisa camisa = new Camisa("Farm", "azul e branco", 59d, "M");
      Calça calça = new Calça("Levi's", "Preta", "42", 109);
      Sapato sapato = new Sapato("Vans", "Preto", "39", 400);
         
      Produto produto = new Produto(camisa, calça, sapato);
      
        System.out.println("Camisa");
        System.out.println(" ");
        System.out.println("marca: " + produto.getCamisa().getMarca());
        System.out.println("cor: " + produto.getCamisa().getCor());
        System.out.println("tamanho: " + produto.getCamisa().getTamanho());
        System.out.println("valor: " + produto.getCamisa().getPreço());
        System.out.println(" ");
        System.out.println("Calça");
        System.out.println(" ");
        System.out.println("marca: " + produto.getCalça().getMarca());
        System.out.println("cor: " + produto.getCalça().getCor());
        System.out.println("tamanho: " + produto.getCalça().getTamanho());
        System.out.println("valor: " + produto.getCalça().getPreço());
        System.out.println(" ");
        System.out.println("Sapato");
        System.out.println(" ");
        System.out.println("marca: " + produto.getSapato().getMarca());
        System.out.println("cor: " + produto.getSapato().getCor());
        System.out.println("tamanho: " + produto.getSapato().getTamanho());
        System.out.println("valor: " + produto.getSapato().getPreço());
    }
 
   
}
