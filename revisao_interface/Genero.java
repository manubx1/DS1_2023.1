/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package revisao_interface;

/**
 *
 * @author DE BOA TURISMO
 */
public enum Genero {
    MASCULINO ("Masculino",'M'),
    FEMININO ("Feminino", 'F');
    
    private String texto;
    private  char caracter;

    private Genero(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaracter() {
        return caracter;
    }
    
    
    
}
