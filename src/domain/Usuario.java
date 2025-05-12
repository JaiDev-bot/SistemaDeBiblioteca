package domain;


public class Usuario {
    private String name;
    private Livro livroAlugado;


    public Usuario(String name){
        this.name = name;
    }


    public Usuario(String name, Livro livroAlugado) {
        this.name = name;
        this.livroAlugado = null;
    }

    public void alugarLivro(Livro livro) {
        if (livro.isDisponivel()){
            livroAlugado = livro;
            livro.setDisponivel(false);
            System.out.println(name + " alugou o livro: " + livro.getTitulo());
        }else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponivel");
        }
    }

    public void devolverLivro() {
        if (livroAlugado != null){
            livroAlugado.setDisponivel(true);
            System.out.println(name + " devolvido o livro: " + livroAlugado.getTitulo());
            livroAlugado = null;
        }else {
            System.out.println(name + " não tem nenhum livro a devolver.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Livro getLivroAlugado() {
        return livroAlugado;
    }

    public void setLivroAlugado(Livro livroAlugado) {
        this.livroAlugado = livroAlugado;
    }
}
