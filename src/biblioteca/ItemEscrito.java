package biblioteca;
public abstract class ItemEscrito {
    private String titulo;
    private String autor;
    private int ano;
    private String genero;

    public ItemEscrito(String titulo, String autor, int ano, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
