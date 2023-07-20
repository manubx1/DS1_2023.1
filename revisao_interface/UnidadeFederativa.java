/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package revisao_interface;

/**
 *
 * @author DE BOA TURISMO
 */
public enum UnidadeFederativa {
    BAHIA ("Bahia", "BA"),
    SP ("São Paulo", "SP"),
    RJ ("Rio de Janeiro", "RJ");
    
    private String texto;
    private String sigla;

    private UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
