import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorLivro gl = new GerenciadorLivro();
        Scanner input = new Scanner(System.in);

        String titulo;
        String autor;
        int ano;

        int retorno;

        while (true) {
            System.out.println("\nEscolha uma opção:\n");
            System.out.println("1 - Adicionar livro;");
            System.out.println("2 - Remover livro;");
            System.out.println("3 - Buscar livro;");
            System.out.println("4 - Mostrar lista;");
            System.out.println("0 - Encerrar.");
            System.out.println("\nOpção: ");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nAdicionar livro\n");
                    System.out.println("Livro:");
                    titulo = input.nextLine();
                    System.out.println("Autor:");
                    autor = input.nextLine();
                    System.out.println("Ano de Publicação:");
                    ano = input.nextInt();
                    gl.adicionar(titulo, autor, ano);
                    System.out.println("\nLivro adicionado na lista.");
                    break;
                case 2:
                    System.out.println("\nRemover livro\n");
                    System.out.println("Livro: ");
                    titulo = input.nextLine();
                    retorno = gl.remover(titulo);
                    if (retorno == 1) {
                        System.out.println("\nLivro removido da lista.");
                    } else {
                        System.out.println("\nLivro não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("\nBuscar livro\n");
                    break;
                case 4:
                    System.out.println("\nMostrar lista\n");
                    break;
                case 0:
                    System.out.println("\nPrograma encerrado.");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }

        }
    }
}
