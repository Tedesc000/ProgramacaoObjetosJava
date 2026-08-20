package estudante;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
// 2. Programe em Java a classe Estudante com os seguintes membros:
// Atributos privados:
// - nome do estudante
// - um array de notas tipo double
// Construtor: um só, que recebe o nome do estudante e dimensiona o array de notas em 5.
// Métodos:
// + insereNotas – permite ler do teclado as cinco notas do estudante e as atribui às cinco posições do
// array.
// + calculaMedia – devolve o valor da média aritmética das notas do estudante
// + métodos get – são dois. O método get para as notas devolve o array de notas
// + menorNota – devolve o valor da menor nota do estudante

public class Estudante {
    private String nome;
    private List<Double> notas;
    Scanner scanner = new Scanner(System.in);

    public Estudante(String nome){
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public Estudante(){
        this.nome = "";
        this.notas = new ArrayList<>();
    }
    /*colocar a exceção que a sora passou em aula */
    public void insereNotas(){
        boolean valido = false;
        while(!valido){
            try{
                for(int i=0; i < 5; i++){
                    System.out.println("Digite a " + (i+1) + " nota do aluno " + this.nome + ":");
                    Double nota = scanner.nextDouble();
                    this.notas.add(nota);
                }
            }catch(InputMismatchException e){
                System.out.println("Entrada inválida! Digite apenas um número inteiro.");
                scanner.nextLine();
            }
        }
    }

//     4. Acrescente uma sobrecarga ao método calculaMedia da classe Estudante, que deverá retornar o
// valor da média ponderada do objeto estudante. Para isso, recebe através de parâmetro um array de
// cinco inteiros que são os pesos respectivos de cada uma das cinco notas.

    public Double calculaMedia(){
        double soma = 0;
        for(double nota: this.notas){
            soma += nota;
        }
        return soma / this.notas.size();
    }

    public Double calculaMedia(int[] pesos){
        double somaPonderada = 0;
        int somaPesos = 0;
        for(int i=0; i < 5; i++){
            somaPonderada += this.notas.get(i) * pesos[i];
            somaPesos += pesos[i];
        }
        return somaPonderada / somaPesos;
    }

    public String getNotas(){
        String notas = "";
        for(int i=0; i < 5; i++){
            notas += "Nota " + (i+1) + ": "+ this.notas.get(i) + "\n";
        }
        return notas;
    }

    public Double menorNota(){
        Double menor = this.notas.get(0);
        for(Double nota: this.notas){
            if(nota < menor){
                menor = nota;
            }
        }
        return menor;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

//     3. Programe em Java um método que recebe via parâmetro um array de objetos Estudante, calcula
// a média de todos eles e devolve um outro array de objetos Estudante contendo apenas aqueles que
// foram aprovados, sabendo que 6 é a média mínima para aprovação. Se nenhum estudante foi
// aprovado, retornar null. A classe Estudante está descrita no exercício 1.

    public static Estudante[] filtrarAprovados(List<Estudante> estudantes){
        List<Estudante> aprovados = new ArrayList<>();
        for(Estudante estudante: estudantes){
            if(estudante.calculaMedia() >= 6){
                aprovados.add(estudante);
            }
        }
        if(aprovados.isEmpty()){
            return null;
        }else{
            return aprovados.toArray(new Estudante[0]);
        }
    }
}
