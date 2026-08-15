import java.util.List;
public class Livro extends ItemEscrito {
    private boolean disponivel;

    public Livro(String titulo, String autor, int ano, String genero) {
        super(titulo, autor, ano, genero);
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void retirarLivro() {
        this.disponivel = false;
    }

    public void devolverLivro() {
        this.disponivel = true;
    }

    public static void listarLivros(List<Livro> livros) {
        System.out.println("Livros:");
        for(Livro livro : livros){
            System.out.println("Título: " + livro.getTitulo() + "\nAutor: " + livro.getAutor() + "\nAno: " + livro.getAno() + "\nGênero: " + livro.getGenero() + "\nDisponível: " + livro.isDisponivel() + "\n------\n");
        }
    }
}
