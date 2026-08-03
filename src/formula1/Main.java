package avaliacao.formula1;
import java.util.Scanner;//tem que importar o scanner para poder ler
public class Main{
    public static void main(String[] args){
        Carro carro = new Carro(); // Já chama o construtor padrão
        Engenheiro engenheiro = new Engenheiro();
        Piloto piloto = new Piloto();
        Equipe equipe = new Equipe();
        Scanner scanner = new Scanner(System.in);
        //adicionando dados do piloto
        System.out.println("Qual o nome do piloto?");
        piloto.setNome(scanner.nextLine());
        System.out.println("Qual a idade do piloto?");
        piloto.setIdade(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer ('Enter') deixado pelo nextInt()
        System.out.println("Qual a nacionalidade do piloto?");
        piloto.setNacionalidade(scanner.nextLine());
        carro.setPiloto(piloto);
        System.out.print("O piloto tem quantas vitorias?");
        piloto.setVitorias(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer ('Enter') deixado pelo nextInt()
        System.out.print("O piloto tem quantos titulos?");
        piloto.setTitulos(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer ('Enter') deixado pelo nextInt()
        carro.getPiloto().exibirDados();
        carro.getPiloto().falar("Vamos ganhar!");
        carro.getPiloto().ultrapassar("João");

        //adicionando dados do engenheiro
        System.out.println("Qual o nome do engenheiro?");
        engenheiro.setNome(scanner.nextLine());
        System.out.println("Qual a idade do engenheiro?");
        engenheiro.setIdade(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer ('Enter') deixado pelo nextInt()
        System.out.println("Qual a nacionalidade do engenheiro?");
        engenheiro.setNacionalidade(scanner.nextLine());
        carro.setEngenheiro(engenheiro);
        System.out.print("O engenheiro tem quantos anos de formacao?");
        engenheiro.setAnoFormacao(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer ('Enter') deixado pelo nextInt()
        System.out.print("O engenheiro tem qual especializacao?");
        engenheiro.setEspecializacao(scanner.nextLine());
        carro.getEngenheiro().exibirDados();
        carro.getEngenheiro().falar("Vamos ganhar!");
        carro.getEngenheiro().projetar("pneu muito bom!");


        //adicionando dados da equipe
        System.out.println("Qual o nome da equipe?");
        equipe.setNome(scanner.nextLine());
        System.out.println("Qual o ano de fundacao da equipe?");
        equipe.setAnoFundacao(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer ('Enter') deixado pelo nextInt()
        System.out.println("Quantos patrocinadores a equipe tem? (Máximo de 10)");
        int qtdPatrocinadores = scanner.nextInt();
        scanner.nextLine(); // limpar buffer
        
        if (qtdPatrocinadores > 10) {
            System.out.println("A equipe só pode ter no máximo 10 patrocinadores. Limitando a 10...");
            qtdPatrocinadores = 10;
        }

        for(int i=0; i<qtdPatrocinadores; i++){ 
            System.out.println("Digite o nome do " + (i+1) + " patrocinador:");
            String nome = scanner.nextLine();
        
            System.out.println("Digite o valor do " + (i+1) + " patrocínio:");
            float valor = scanner.nextFloat();
            scanner.nextLine(); // limpar buffer
        
            Patrocinadores p = new Patrocinadores(nome, valor);
            equipe.setPatrocinadores(p, i);
        }
        carro.setEquipe(equipe);
        carro.getEquipe().exibirDados();
        equipe.listarPatrocinadores();

        carro.acelerar();
        carro.freiar();
        carro.curva();
        carro.getCarro();
        scanner.close();
    }
}