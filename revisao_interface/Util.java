/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao_interface;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DE BOA TURISMO
 */
public class Util {
    public static String formatarData(LocalDate data){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatar.format(data);
    }
     public static String formatarMonetario(double valor){
         NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(valor);
     }
}
