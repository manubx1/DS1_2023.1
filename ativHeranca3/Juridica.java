/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativHeranca3;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorContrato;

    public Juridica(String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    @Override
    public String toString() {
        return 
                super.toString() +
                "\n CNPJ: " + cnpj + 
                "\n InscricaoEstadual: " + inscricaoEstadual + 
                "\n Data Inicio: " + dataInicio + 
                "\n Data Termino: " + dataTermino + 
                "\n Valor Contrato: " + valorContrato;
    }
    
    
}
