package estudante;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean opt = true;
        double nota;
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

            System.out.println("Deseja adicionar mais alunos?(true-sim | false-não)");
            opt = scanner.nextBoolean();
            scanner.nextLine();
        } while (opt);

        System.out.println("Média dos alunos:\n");
        for(Estudante estudante: estudantes){
            System.out.println("Aluno(a) " + estudante.getNome() + ": " + estudante.calculaMedia());
        }

        System.out.println("Alunos aprovados:\n");
        Estudante aprovados[] = Estudante.filtrarAprovados(estudantes);
    }
}
