/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attGetSet1;

/**
 *
 * @author Aluno
 */
public class Livro {
        private String Título; 
    private String Autor; 
    private float ISBN; 
    private float Npagina; 
    private float preço; 

    public Livro(String Título, String Autor, float ISBN, float Npagina, float preço) {
        this.Título = Título;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.Npagina = Npagina;
        this.preço = preço;
        
        
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public float getISBN() {
        return ISBN;
    }

    public void setISBN(float ISBN) {
        this.ISBN = ISBN;
    }

    public float getNpagina() {
        return Npagina;
    }

    public void setNpagina(float Npagina) {
        this.Npagina = Npagina;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
    

    
}
