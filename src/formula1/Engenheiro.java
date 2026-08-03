package avaliacao.formula1;

public class Engenheiro extends Pessoa {
    private int anoFormacao;
    private String especializacao;
    Piloto piloto = new Piloto();

    //construtor padrao
    public Engenheiro(){
        // Como Pessoa não tem um construtor vazio chama o construtor de Pessoa 
        // logo na primeira linha usando super()
        super("Fred", 42, "Brasileiro");
        this.anoFormacao = 2002;
        this.especializacao = "Aerodinamica";
    } 

    //setters
    public void setAnoFormacao(int anoFormacao){
        this.anoFormacao = anoFormacao;
    }
    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;
    }
    //getters
    public int getAnoFormacao(){
        return this.anoFormacao;
    }
    public String getEspecializacao(){
        return this.especializacao;
    }

    public void exibirDados(){
        System.out.println("Nome do engenheiro: " + getNome());
        System.out.println("Idade do engenheiro: " + getIdade());
        System.out.println("Nacionalidade do engenheiro: " + getNacionalidade());
        System.out.println("Ano de formação do piloto: " + getAnoFormacao());
        System.out.println("Especializacao do piloto: " + getEspecializacao());
    }

    //metodos
    public void projetar(String peca){
        System.out.println(this.getNome() + " projetou a peça " + peca);
    }
}
