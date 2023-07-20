
package ativHeranca3;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Margaridas", "24", "Ed. Papaleguas", "4785946597", "Salvador", UnidadeFederativa.BAHIA);
        Fisica fisica = new Fisica(Genero.FEMININO, "56845915-85", "894566649", LocalDate.of(2000, Month.MARCH, 31), 15000, 001, "Gardenia", "719 97449", endereco);
        Juridica juridica = new Juridica("18799854439-0001", "555555", LocalDate.of(2010, Month.APRIL, 11), LocalDate.of(2023, Month.MARCH, 31), 4874444,001, "A Fantastica Fábrica", "71 9 59879584979", endereco);
        
        System.out.println("Física: " + fisica.toString());
        System.out.println("");
        System.out.println("Juridica: " + juridica.toString());
        System.out.println("");

           
    }
}
