package estudante;
import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private List<Double> notas;

    public Estudante(String nome){
        this.nome = nome;
        this.notas = new ArrayList<>();
    }
}
