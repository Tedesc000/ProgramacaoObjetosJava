package avaliacao.formula1;
public class Piloto extends Pessoa {
    private int titulos;
    private int vitorias;
    
    //construtor padrao
    public Piloto(){
        // Como Pessoa não tem um construtor vazio, você DEVE chamar o construtor de Pessoa 
        // logo na primeira linha usando super()
        super("Leclerc", 25, "Brasileiro");
        this.titulos = 0;
        this.vitorias = 0;
    } 

    //setters
    public void setTitulos(int titulos){
        this.titulos = titulos;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    //getters
    public int getTitulos(){
        return this.titulos;
    }
    public int getVitorias(){
        return this.vitorias;
    }

    //getter
    public void exibirDados(){
        System.out.println("Nome do piloto: " + getNome());
        System.out.println("Idade do piloto: " + getIdade());
        System.out.println("Nacionalidade do piloto: " + getNacionalidade());
        System.out.println("Titulos do piloto: " + getTitulos());
        System.out.println("Vitorias do piloto: " + getVitorias());
    }

    //metodos
    public void ultrapassar(String nome){
        System.out.println(this.getNome() + " ultrapassou " + nome);
    }
}
