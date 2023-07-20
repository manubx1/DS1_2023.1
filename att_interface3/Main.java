/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package att_interface3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author DE BOA TURISMO
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("PF4FGRH", "Clovis", "555555555", Genero.MASCULINO, 150.88, LocalDate.of(1999, Month.MARCH, 5));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Creuza", "8888888", Genero.FEMININO, 5000, LocalDate.of(2000, Month.MARCH, 12));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Carlos", "6666666", Genero.MASCULINO, 10000, LocalDate.of(2001, Month.MARCH, 8));
    
        System.out.println(motoboy);
        System.out.println(gerente);
        System.out.println(diretor);
    }
}
