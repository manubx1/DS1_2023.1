/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package revisao_interface;

/**
 *
 * @author DE BOA TURISMO
 */
public class Produto {
    private String nome;
    private String categoria;
    private double preco;

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return " Produto " +
                super.toString() +
                "\n Nome: " + nome + 
                "\n Categoria: " + categoria +
                "\n Preco: " + Util.formatarMonetario(preco);
    }
    
    
}
