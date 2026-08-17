package biblioteca;
import java.util.List;
public class Periodico extends ItemEscrito {
    private int numVolume;

    public Periodico() {
        super("", "", 0, "");
        this.numVolume = 0;
    }
    
    public Periodico(String titulo, String autor, int ano, String genero, int numVolume) {
        super(titulo, autor, ano, genero);
        this.numVolume = numVolume;
    }
    
    public int getNumVolume() {
        return numVolume;
    }
    
    public void setNumVolume(int numVolume) {
        this.numVolume = numVolume;
    }

    public static void listarPeriodicos(List<Periodico> periodicos) {
        System.out.println("Periodicos:");
        for(Periodico periodico : periodicos){
            System.out.println("Título: " + periodico.getTitulo() + "\nAutor: " + periodico.getAutor() + "\nAno: " + periodico.getAno() + "\nGênero: " + periodico.getGenero() + "\nVolume: " + periodico.getNumVolume() + "\n------\n");
        }
    }
}
