
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package att_interface;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author DE BOA TURISMO
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("HRGH54O", "Geraldo", LocalDate.of(2002, Month.MARCH, 5), Genero.MASCULINO, Setor.OPERACOES, 1500);
        Diretor diretor = new Diretor("Gio", LocalDate.of(1998, Month.MARCH, 16), Genero.FEMININO, Setor.RH, 8000);
    
        System.out.println(diretor);
        System.out.println("");
        diretor.demitir(motoboy);
        System.out.println("");
    }
}
