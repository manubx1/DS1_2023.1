
package revisao_interface;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author DE BOA TURISMO
 */
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Quiabo", "1", "bloco 34", "408788", "Rio de Janeiro", UnidadeFederativa.RJ);
    
        Medico medico = new Medico("0000000", "000000000", "0000000000", "000000000", Setor.SAUDE, 30000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1999, Month.MARCH, 1), "Julia", "0000000000", "Jubis@gmail", new Endereco("11111", "1", "bloco j", "555555555", "Salvador", UnidadeFederativa.BAHIA));
       
        Diretor diretor = new Diretor("00000000", "77777777", "88888", Setor.RH, 15000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2004, Month.MARCH, 21), "Laila", "0000000", "laila@gmail", endereco);
       
        Motoboy motoboy = new Motoboy("NHEDHFPE", "77777", "85685686868", "555555", Setor.SAUDE, 1500, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(2004, Month.MARCH, 15), "Iago", "333333", "gmailll", endereco);
        
       Engenheiro engenheiro = new Engenheiro("00000", "888888", "9999999", "111111", Setor.ENGENHARIA, 8000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2004, Month.MARCH, 24), "Linda", "71 0000000", "linda@gmail.com", new Endereco("Jilo", "1", "Bloco b", "45489598", "Salvador", UnidadeFederativa.BAHIA));
    
        System.out.println(diretor);
        System.out.println("");
        diretor.admitir(engenheiro);
        System.out.println("");
        
         System.out.println(diretor);
        System.out.println("");
        diretor.admitir(medico);
        System.out.println("");
        
         System.out.println(diretor);
        System.out.println("");
        diretor.admitir(motoboy);
        System.out.println("");
        

        
  
    
    }
}
