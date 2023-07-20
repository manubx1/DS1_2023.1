
package revisao_interface;

/**
 *
 * @author DE BOA TURISMO
 */
public enum EstadoCivil {
    SOLTEIRO ("Solteiro (a)"),
    CASADO("Casado (a)"),
    DIVOCIADO("Divorciado (a)"),
    SEPARADO("Separado (a)"),
    VIUVO("Viuvo (a)");
    
    private String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
