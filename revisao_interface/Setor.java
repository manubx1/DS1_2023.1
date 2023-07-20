/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package revisao_interface;

/**
 *
 * @author DE BOA TURISMO
 */
public enum Setor {
    TECNOLOGIA("Tecnologia"), 
    MATERIAL_CONTRUCAO("Material de Contrução"),
    MATERIA_PRIMA("Materia Prima"),
    ALIMENTICIO("Alimenticio"),
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    RH ("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operacoes");
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
