/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package att_interface;

/**
 *
 * @author DE BOA TURISMO
 */
public enum Genero {
    MASCULINO ("Masculino"),
    FEMININO("Feminino");
    
    private String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
