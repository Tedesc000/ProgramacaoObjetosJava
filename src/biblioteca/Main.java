import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        boolean op;
        int opBiblio;
        int opInserir;
        Scanner scanner = new Scanner(System.in);
        do { 
            System.out.println("Olá estudante, o que deseja fazer hoje?");
            System.out.println("1 - Retirar livro\n2 - Listar livros ou periódicos\n3 - Inserir livro ou periódico");
            opBiblio = scanner.nextInt();
            switch (opBiblio) {
                case 1:

                break;
                case 2:
                    
                break;
                case 3:
                    System.out.println("1 - Inserir livro\n2 - Inserir periódicos");
                    opInserir = scanner.nextInt();
                    if(opInserir == 1){
                        

                        Livro livro = new Livro();


                    }
                break;
            }

            System.out.println("Deseja continuar na biblioteca?");
            op = scanner.nextBoolean();
        } while (op);
    }
}
