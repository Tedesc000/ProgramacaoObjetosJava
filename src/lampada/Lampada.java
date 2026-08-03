/* Crie uma classe Lampada
Escreva um construtor para a classe Lampada de forma que instâncias desta só possam ser criadas se um estado inicial for 
passado para o construtor. Esse estado pode ser o valor booleano que indica se a lâmpada está acesa (true) ou apagada (false).
Crie o método interruptor para trocar o estado e dizer se a lâmpada está acesa ou apagada.
Crie um método que exiba se a mesma está acesa ou apagada.*/

// Considere a classe Lampada que também representa o número de watts da lâmpada (veja o exercício 4). 
// Escreva dois construtores para a classe: um que recebe como argumentos o número de watts da lâmpada, 
// e outro, sem argumentos, que considera que a lâmpada tem 60 watts por default.
package lampada;
import java.util.Scanner;
public class Lampada {
    private boolean acesa;
    private int potencia;
    Scanner scanner = new Scanner(System.in);
    
    //construtor padrão que pede o estado inicial e e valida a potência entre valores de 1 e 1000W
    public Lampada(boolean acesa, int potencia){
        this.acesa = acesa;
        while(potencia < 1 || potencia > 1000){
            System.out.println("Os valores de potência não devem ser menores que 1 e maiores que 1000!, digite novamente: ");
            potencia = scanner.nextInt();
        }
        this.potencia = potencia;
    }
    //construtor padrão que adiciona o default da potencia como 60w.
    public Lampada(){
        this.acesa = true;
        this.potencia = 60;
    }
    //getter que retorna a potência
    public int getPotencia(){
        return potencia;
    }
    //método que inverte o estado da lâmpada (liga/desliga)
    public void interruptor(){
        if(acesa){
            acesa = false;
        } else{
            acesa = true;
        }
    }
    //método que verifica e exibe o estado da lâmpada
    public void verificarAcesa(){
        if(acesa){
            System.out.println("A lâmpada está acesa!");
        } else{
            System.out.println("A lâmpada está apagada!");
        }
    }
}
