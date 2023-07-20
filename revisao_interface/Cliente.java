/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao_interface;

import java.time.LocalDate;

/**
 *
 * @author DE BOA TURISMO
 */
public class Cliente extends Fisica{
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\n Cliente " + 
                super.toString() +
                "\n protocoloAtendimento: " + protocoloAtendimento;
    }
    
    
}
