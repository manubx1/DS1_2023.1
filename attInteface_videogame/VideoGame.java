/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attInteface_videogame;

/**
 *
 * @author DE BOA TURISMO
 */
public class VideoGame {
    private Jogo jogo;
    
    public void ligar(){
        System.out.println("Iniciando....");
    }
    
    public void jogar(Jogo jogo){
        this.jogo=jogo;
        this.jogo.jogar();
    }
    public void fechar(){
        this.jogo.fechar();
    }
    public void desligar(){
        System.out.println("Desligando....");
    }
}
