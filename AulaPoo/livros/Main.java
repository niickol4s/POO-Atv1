import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorLivro gl = new GerenciadorLivro();
        Scanner inputOpcao = new Scanner(System.in);
        Scanner inputLivro = new Scanner(System.in);
        Scanner inputAutor = new Scanner(System.in);
        Scanner inputAno = new Scanner(System.in);

        String titulo;
        String autor;
        int ano;

        int opcao;
        int retorno;

        do {
            System.out.println("\nEscolha uma opção:\n");
            System.out.println("1 - Adicionar livro;");
            System.out.println("2 - Remover livro;");
            System.out.println("3 - Buscar livro;");
            System.out.println("4 - Mostrar lista;");
            System.out.println("0 - Encerrar.");
            System.out.print("\nOpção: ");
            opcao = inputOpcao.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nAdicionar livro\n");
                    System.out.print("Livro: ");
                    titulo = inputLivro.nextLine();
                    System.out.print("Autor: ");
                    autor = inputAutor.nextLine();
                    System.out.print("Ano de Publicação: ");
                    ano = inputAno.nextInt();                    
                    gl.adicionar(titulo, autor, ano);
                    System.out.println("\nLivro adicionado na lista.");
                    break;
                case 2:
                    System.out.println("\nRemover livro\n");
                    System.out.print("Livro: ");
                    titulo = inputLivro.nextLine();
                    retorno = gl.remover(titulo);
                    if (retorno == 1) {
                        System.out.println("\nLivro removido da lista.");
                    } else {
                        System.out.println("\nLivro não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("\nBuscar livro\n");
                    System.out.print("Livro: ");
                    titulo = inputLivro.nextLine();
                    retorno = gl.exibir(titulo);
                    if (retorno == 1){
                        gl.exibir(titulo);
                    } else {
                        System.out.println("\nLivro não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("\nMostrar lista\n");
                    gl.imprimirLista();
                    break;            
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }

        } while (opcao != 0);

        System.out.println("\nPrograma encerrado.");
    }
}
