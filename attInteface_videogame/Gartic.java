/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attInteface_videogame;

/**
 *
 * @author DE BOA TURISMO
 */
public class Gartic implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Desenhe uma tartaruga");
    }

    @Override
    public void fechar() {
        System.out.println("Partida finalizada");
    }
    
}
