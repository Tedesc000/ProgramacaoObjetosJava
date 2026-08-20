package estudante;
import java.util.ArrayList;
import java.util.InputMismatchException;
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

            do {
                System.out.println("Deseja adicionar mais alunos?(1-sim | 0-não)");
                try {
                    opt = scanner.nextInt();
                    if (opt != 1 && opt != 0) {
                        System.out.println("Opção inválida! Digite 1 ou 0.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite apenas um número inteiro.");
                    scanner.nextLine();
                    opt = -1;
                }
            } while (opt != 1 && opt != 0);
        scanner.nextLine();
        } while (opt == 1);

        for(int i=0; i<5; i++){
            boolean valido = false;
            while(!valido){
                System.out.println("Digite o peso da nota " + (i+1) + ":");
                try {
                    pesos[i] = scanner.nextInt();
                    valido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite apenas um número inteiro.");
                    scanner.nextLine();
                }
            }
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
