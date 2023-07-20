/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attInteface_videogame;

/**
 *
 * @author DE BOA TURISMO
 */
public class Ludo implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Rode o dado, e ande as casas");
    }

    @Override
    public void fechar() {
        System.out.println("Partida finalizada");
    }
    
}
