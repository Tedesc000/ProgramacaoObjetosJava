package estudante;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opt;
        double nota;
        int[] pesos = new int[5];
        Scanner scanner = new Scanner(System.in);
        List<Estudante> estudantes = new ArrayList<Estudante>();

        do {
            Estudante estudante = new Estudante(); 
            System.out.println("Insira os dados do aluno:\n");
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();
            estudante.setNome(nome);
            System.out.println("Digite as notas do aluno:");
            estudante.insereNotas();
            estudantes.add(estudante);

            System.out.println("Deseja adicionar mais alunos?(1-sim | 0-não)");
            opt = scanner.nextInt();
            scanner.nextLine();
        } while (opt == 1);

        for(int i=0; i<5; i++){
            System.out.println("Digite o peso da nota " + (i+1) + ":");
            pesos[i] = scanner.nextInt();
        }

        System.out.println("Média dos alunos:\n");
        for(Estudante estudante: estudantes){
            System.out.println("\nAluno(a) " + estudante.getNome() + ":");
            System.out.println(estudante.getNotas());
            System.out.println("Media arimetrica: " + estudante.calculaMedia());
            System.out.println("Menor nota: " + estudante.menorNota());
            System.out.println("Media ponderada: " + estudante.calculaMedia(pesos));
        }

        System.out.println("\nAlunos aprovados:");
        Estudante aprovados[] = Estudante.filtrarAprovados(estudantes);

        if(aprovados == null){
            System.out.println("Nenhum aluno aprovado");
        }else{
            for(Estudante aprovado: aprovados){
                System.out.println("Aluno(a) " + aprovado.getNome() + ": " + aprovado.calculaMedia());
            }
        }
    }
}
