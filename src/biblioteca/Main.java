// 5. Uma biblioteca possui em seu acervo livros e periódicos. Cada livro tem título e situação; cada
// periódico tem título e número do volume. Os periódicos não podem sair da biblioteca, mas os livros
// sim. Durante o empréstimo, a situação de um livro é emprestado, quando ele é devolvido, retorna à
// situação de disponível.
// Escreva um programa em Java para as duas classes Livro e Periódico, com os atributos necessários
// segundo o que foi descrito. Crie uma superclasse que reúna as características comuns a ambas as
// classes. Dote cada classe de um construtor, de métodos necessários para implementar o
// comportamento descrito acima, e acrescente métodos para retornar o valor de cada atributo.
// Sugestão: use um atributo booleano disponivel para indicar a disponibilidade e um método de
// acesso isDisponivel para retornar este estado do livro.
// package biblioteca; sora tive que comentar os package pq tava dando erro
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int op;
        int opBiblio;
        int opInserir, opListar;
        Scanner scanner = new Scanner(System.in);
        List<Livro> livros = new ArrayList<Livro>();
        List<Periodico> periodicos = new ArrayList<Periodico>();
        do { 
            System.out.println("Olá estudante, o que deseja fazer hoje?");
            System.out.println("1 - Retirar livro\n2 - Devolver livro\n3 - Listar livros ou periódicos\n4 - Inserir livro ou periódico");
            opBiblio = scanner.nextInt();
            scanner.nextLine();
            switch (opBiblio) {
                case 1:
                    System.out.println("Livros para retirar:\n");
                    Livro.listarDisponiveis(livros);
                    System.out.println("Digite o título do livro que deseja retirar");
                    String tituloLivro = scanner.nextLine();
                    for(Livro livro : livros){
                        if(livro.getTitulo().equals(tituloLivro)){
                            livro.retirarLivro();
                            System.out.println("Livro retirado com sucesso!");
                            break;
                        }
                    }
                break;
                case 2:
                    System.out.println("Digite o título do livro que deseja devolver");
                    String tituloDevolver = scanner.nextLine();
                    for(Livro livro : livros){
                        if(livro.getTitulo().equals(tituloDevolver)){
                            livro.devolverLivro();
                            System.out.println("Livro devolvido com sucesso!");
                            break;
                        }
                    }
                break;
                case 3:
                    System.out.println("O que deseja listar?");
                    System.out.println("1 - Listar livro\n2 - Listar periódicos");
                    opListar = scanner.nextInt();
                    scanner.nextLine();
                    if(opListar == 1){
                        Livro.listarLivros(livros);
                    }else if(opListar == 2){
                        Periodico.listarPeriodicos(periodicos);
                    }
                break;
                case 4:
                    System.out.println("O que deseja inserir?");
                    System.out.println("1 - Inserir livro\n2 - Inserir periódicos");
                    opInserir = scanner.nextInt();
                    scanner.nextLine();
                    if(opInserir == 1){
                        Livro livro = new Livro();
                        System.out.println("Digite o título do livro");
                        livro.setTitulo(scanner.nextLine());
                        System.out.println("Digite o autor do livro");
                        livro.setAutor(scanner.nextLine());
                        System.out.println("Digite o ano do livro");
                        livro.setAno(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("Digite o Genero do livro");
                        livro.setGenero(scanner.nextLine());
                        livros.add(livro);
                    }else if(opInserir == 2){
                        Periodico periodico = new Periodico();
                        System.out.println("Digite o título do periodico");
                        periodico.setTitulo(scanner.nextLine());
                        System.out.println("Digite o autor do periodico");
                        periodico.setAutor(scanner.nextLine());
                        System.out.println("Digite o ano do periodico");
                        periodico.setAno(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("Digite o Genero do periodico");
                        periodico.setGenero(scanner.nextLine());
                        System.out.println("Digite o número do volume do periodico");
                        periodico.setNumVolume(scanner.nextInt());
                        scanner.nextLine();
                        periodicos.add(periodico);
                    }
                break;
            }

            System.out.println("Deseja continuar na biblioteca?(1 - sim | 2 - não)");
            op = scanner.nextInt();
            scanner.nextLine();
        } while (op == 1);
    }
}
