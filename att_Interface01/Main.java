/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package att_Interface01;

/**
 *
 * @author DE BOA TURISMO
 */
public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        
        System.out.println(soma.calcular(1, 1));
        System.out.println(subtracao.calcular(1, 1));
        System.out.println(multiplicacao.calcular(1, 1));
        System.out.println(divisao.calcular(1, 1));
        
    }
}
