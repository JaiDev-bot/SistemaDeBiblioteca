package domain;

import java.util.ArrayList;
import java.util.Locale;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println(" Livro Adicionado: " + livro.getTitulo());

    }
    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario cadastrado " + usuario.getName());
    }


    public Livro buscarLivro(String titulo){
        String tituloMinusculoDigitado = titulo.toLowerCase();
    for(Livro livro: livros){
        if (livro.getTitulo().toLowerCase().equals(tituloMinusculoDigitado)){
            return livro;
        }
    }
    return null;

    }

    public Usuario buscarUsuario(String name){
    for(Usuario usuario: usuarios){
        if((usuario.getName()).equals(name)){
            return usuario;
        }
    }

    return null;
    }



    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
}
