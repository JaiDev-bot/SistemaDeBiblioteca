import domain.Biblioteca;
import domain.Livro;
import domain.Usuario;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        //add alguns livros e usuarios para teste
        biblioteca.adicionarLivro(new Livro("Os sete maridos de Evelyn Hugo"));
        biblioteca.adicionarLivro(new Livro("Sob a redoma"));
        biblioteca.adicionarLivro(new Livro("O cemitério"));
        biblioteca.adicionarLivro(new Livro("O conde de monte cristo"));
        biblioteca.adicionarLivro(new Livro("Os miseraveis"));
        biblioteca.adicionarLivro(new Livro("Estamos bem"));
        biblioteca.adicionarLivro(new Livro("Harry Potter"));
        biblioteca.adicionarLivro(new Livro("A dança da morte"));

        biblioteca.adicionarUsuario(new Usuario("Anna"));
        biblioteca.adicionarUsuario(new Usuario("Jaiane"));

        // interação com o usuario

        while (true){
            System.out.println("|[1] ALUGAR LIVRO   |");
            System.out.println("|[2] DEVOLVER LIVRO |");
            System.out.println("|[3] SAIR           |");
            System.out.println("|-------------------|");
            System.out.println("Escolha uma opcão: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir a nova linha

            if(opcao == 1){
                System.out.println("digite o nome do usuario: ");
                String nomeUsuario = scanner.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if (usuario != null){
                    System.out.println(" digite o titulo do livro: ");
                    String nomeLivro = scanner.nextLine();
                    Livro livro = biblioteca.buscarLivro(nomeLivro);

                    if(livro!= null){
                        usuario.alugarLivro(livro);
                    } else{
                        System.out.println("livro  não encontrado");
                    }

                } else {
                    System.out.println("usuario não encontrado");
                }

            } else if (opcao==3){
                System.out.println("saindo...............");
                break;
            }else{
                System.out.println("opção invalida ");
            }
        }

        scanner.close();
    }
}