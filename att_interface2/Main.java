/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package att_interface2;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("567497ngff", "Clovis", LocalDate.of(2002, Month.MARCH, 5), Genero.MASCULINO, Setor.OPERACOES, 100);
        
        Diretor diretor = new Diretor("Juli", LocalDate.of(2002, Month.MARCH, 10), Genero.FEMININO, Setor.RH, 500);
        
        diretor.admitir(motoboy);
        
        System.out.println("");
        
        System.out.println(diretor);
        
    }
}
