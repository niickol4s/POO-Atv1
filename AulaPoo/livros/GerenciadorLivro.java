import java.util.ArrayList;

public class GerenciadorLivro {
    private ArrayList<Livro> livros = new ArrayList<>();

    public ArrayList getLivros() {
        return livros;
    }

    public void adicionar(String titulo, String autor, int ano) {
        Livro l = new Livro(titulo, autor, ano);
        this.livros.add(l);
    }

    public int remover(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                this.livros.remove(livro);
                return 1;
            }
        }
        return 0;
    }

    public int exibir(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                System.out.println("\nInformações do Livro:\n");
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano de Publicação: " + livro.getAno());
                return 1;
            }
        }
        return 0;
    }

    public void imprimirLista() {     
        if (livros.isEmpty()) {
            System.out.println("\nLista vazia.");
        } else {
            for (Livro livro : livros) {
                System.out.println("\nLista de Livros:\n");
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano de Publicação: " + livro.getAno());
            }
        }
        
    }

}
