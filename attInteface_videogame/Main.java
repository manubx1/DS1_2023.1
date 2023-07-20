/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attInteface_videogame;

/**
 *
 * @author DE BOA TURISMO
 */
public class Main {
    public static void main(String[] args) {
        VideoGame game = new VideoGame();
        
       game.ligar();
       game.jogar(new Ludo());
       game.fechar();
       game.desligar();
    }
    
}
