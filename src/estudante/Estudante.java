package estudante;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudante {
    private String nome;
    private List<Double> notas;
    Scanner scanner = new Scanner(System.in);

    public Estudante(String nome){
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void insereNotas(){
        for(Integer i=0; i <= 5; i++){
            System.out.println("Digite a " + i+1 + "nota do aluno " + this.nome + ":");
            Double nota = scanner.nextDouble();
            this.notas.add(nota);
        }
    }

    public Double calculaMedia(){
        Double soma = 0;
        

    }
}
