package lampada;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean estaAcesa;
        //aqui criou a variável global que vai receber a instância de lampada
        Lampada lampada;
        Scanner scanner = new Scanner(System.in);
        //aqui pergunta se o usuário deseja adicionar um valor para o estado inicial e potencia da lâmpada
        System.out.println("Você deseja adicionar um valor para o estado inicial e potencia da lâmpada?(1-Sim ; 0-Não)");
        int opcao = scanner.nextInt();
        if(opcao == 1){
            System.out.println("Digite o estado inicial da lâmpada: (1 - Acesa ; 0 - Apagada)");
            int estadoInicial = scanner.nextInt();
            if(estadoInicial == 1){
                estaAcesa = true;
            }else{
                estaAcesa = false;
            }
            System.out.println("Digite o valor da potencia: ");
            int watt = scanner.nextInt();
            //chama o construtor com os valores passados pelo usuário
            lampada = new Lampada(estaAcesa, watt);
            System.out.println("A potência é de: " + lampada.getPotencia() + "W!");
        }else{
            //chama o construtor padrão que define a potência como 60w e a lâmpada como acesa
            lampada = new Lampada();
            System.out.println("A potência é de: " + lampada.getPotencia() + "W!");
        }

        //ativa o interruptor
        System.out.println("Ativando o interruptor...\n");
        lampada.interruptor();
        //verifica o estado da lâmpada
        System.out.println("Verificando se está acesa\n");
        lampada.verificarAcesa();

        scanner.close();
    }
}
