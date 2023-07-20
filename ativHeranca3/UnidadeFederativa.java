/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativHeranca3;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA("bahia", "BA"),
    SÃO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    private final String cidade;
    private final String sigla;

    private UnidadeFederativa(String cidade, String sigla) {
        this.cidade = cidade;
        this.sigla = sigla;
    }

    public String getCidade() {
        return cidade;
    }

    public String getSigla() {
        return sigla;
    }
    
}
