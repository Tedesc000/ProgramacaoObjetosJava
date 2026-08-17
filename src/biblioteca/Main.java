package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        boolean op;
        int opBiblio;
        int opInserir, opListar;
        Scanner scanner = new Scanner(System.in);
        List<Livro> livros = new ArrayList<Livro>();
        List<Periodico> periodicos = new ArrayList<Periodico>();
        do { 
            System.out.println("Olá estudante, o que deseja fazer hoje?");
            System.out.println("1 - Retirar livro\n2 - Listar livros ou periódicos\n3 - Inserir livro ou periódico");
            opBiblio = scanner.nextInt();
            switch (opBiblio) {
                case 1:

                break;
                case 2:
                    System.out.println("1 - Listar livro\n2 - Listar periódicos");
                    opListar = scanner.nextInt();
                    if(opListar == 1){
                        Livro.listarLivros(livros);
                    }else if(opListar == 2){
                        Periodico.listarPeriodicos(periodicos);
                    }
                    opListar = scanner.nextInt();
                break;
                case 3:
                    System.out.println("1 - Inserir livro\n2 - Inserir periódicos");
                    opInserir = scanner.nextInt();
                    if(opInserir == 1){
                        Livro livro = new Livro();
                        System.out.println("Digite o título do livro");
                        livro.setTitulo(scanner.nextString);
                        System.out.println("Digite o autor do livro");
                        livro.setAutor(scanner.nextString);
                        System.out.println("Digite o ano do livro");
                        livro.setAno(scanner.nextInt);
                        System.out.println("Digite o Genero do livro");
                        livro.setGenero(scanner.nextString);
                        livros.add(livro);
                    }else if(opInserir == 2){
                        Periodico periodico = new Periodico();
                        System.out.println("Digite o título do periodico");
                        periodico.setTitulo(scanner.nextString);
                        System.out.println("Digite o autor do periodico");
                        periodico.setAutor(scanner.nextString);
                        System.out.println("Digite o ano do periodico");
                        periodico.setAno(scanner.nextInt);
                        System.out.println("Digite o Genero do periodico");
                        periodico.setGenero(scanner.nextString);
                        System.out.println("Digite o número do volume do periodico");
                        periodico.setNumVolume(scanner.nextInt);
                        periodicos.add(periodico);
                    }
                break;
            }

            System.out.println("Deseja continuar na biblioteca?");
            op = scanner.nextBoolean();
        } while (op);
    }
}
