/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativHeranca4;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        //MOTOBOY
        Motoboy motoboy = new Motoboy("4875GR5", "Shrek", "00000000-555", "97945-5555", Genero.MASCULINO, Setor.OPERACOES, 1000, LocalDate.of(2010, Month.MARCH, 30));
        
        //GERENTE
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Fiona", "0000000-77", "58416-00", Genero.FEMININO, Setor.RH, 1000, LocalDate.of(2020, Month.MARCH, 12));
        
        //DIRETOR 
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Clóvis", "55555555-55", "2222222-22", Genero.MASCULINO, Setor.ENGENHARIA, 0, LocalDate.of(2004, Month.AUGUST, 11));
        
        System.out.println(motoboy);
        System.out.println(gerente);
        System.out.println(diretor);
        
    }
}
