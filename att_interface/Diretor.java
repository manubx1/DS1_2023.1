
package att_interface;

import java.time.LocalDate;

/**
 *
 * @author DE BOA TURISMO
 */
public class Diretor extends Funcionario implements Contratacao{
     
    private final double PREMIO = 0.2;

    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double SalarioBase) {
        super(nome, dataNascimento, genero, setor, SalarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor (a)" + 
                super.toString() + 
                "\n Premio: " + PREMIO + "%" +
                "\n Salario Final: " + Util.formatarValor(getSalarioFinal());
    }

    @Override
    public double getSalarioFinal() {
        return SalarioBase + SalarioBase * this.PREMIO; 
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario: " + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionario: " + funcionario);
    }
    
    
}
