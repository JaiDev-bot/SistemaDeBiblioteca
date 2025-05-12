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

        // Iteração com o usuário
        while(true){
            System.out.println("******Sistema de Biblioteca DoBackAoFront******");
            System.out.println("1 - Alugar Livro!");
            System.out.println("2 - Devolver Livro!");
            System.out.println("3 - Sair!");
            System.out.println("Escolha uma das opções: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1){
                System.out.print("Digite o nome do usuário: ");
                String nomeUsuario = scanner.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if(usuario != null) {
                    System.out.print("Digite o nome do livro: ");
                    String tituloLivro = scanner.nextLine();
                    Livro livro = biblioteca.buscarLivro(tituloLivro);

                    if (livro != null) {
                        usuario.alugarLivro(livro);
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
                }
            }else if(opcao == 2){
                System.out.print("Digite o nome do usuário: ");
                String nomeUsuario = scanner.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if(usuario != null){
                    usuario.devolverLivro();
                }else {
                    System.out.println("Usuário não encontrado!");
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            }else {
                System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}