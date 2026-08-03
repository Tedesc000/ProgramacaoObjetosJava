package avaliacao.formula1;
public class Carro {
    private int numero;
    private int posicao;
    private Equipe equipe;
    private Piloto piloto;
    private Engenheiro engenheiro;
    // Construtor padrao com dados pre definidos
    public Carro(){
        this.numero = 1;
        this.posicao = 1;
        // É preciso instanciar a Equipe e o Piloto ("dar vida" a eles) antes de usar!
        this.equipe = new Equipe();
        this.equipe.setEquipe();
        
        this.piloto = new Piloto(); // Precisamos instanciar o piloto padrão
        this.engenheiro = new Engenheiro();
    }

    // Construtor com parametros
    public Carro(int numero, int posicao, Equipe equipe, Piloto piloto, Engenheiro engenheiro){
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
        this.engenheiro = engenheiro;
    }
    //getter padrao
    public void getCarro(){
        System.out.println("Carro: ");
        System.out.println("Numero: " + this.numero);
        System.out.println("Posicao: " + this.posicao);
    }

    //setters individuais
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setPosicao(int posicao){
        this.posicao = posicao;
    }
    public void setEquipe(Equipe equipe){
        this.equipe = equipe;
    }
    public void setPiloto(Piloto piloto){
        this.piloto = piloto;
    }
    public void setEngenheiro(Engenheiro engenheiro){
        this.engenheiro = engenheiro;
    }
    //getters individuais
    public int getNumero(){
        return this.numero;
    }
    public int getPosicao(){
        return this.posicao;
    }
    public Equipe getEquipe(){
        return this.equipe;
    }
    public Piloto getPiloto(){
        return this.piloto;
    }
    public Engenheiro getEngenheiro(){
        return this.engenheiro;
    }

    //metodos
    public void acelerar(){
        System.out.println("VRUUUUUUUUUUUM!!!");
    }
    public void freiar(){
        System.out.println("NHEEEEEEERRREERRER!!!");
    }
    public void curva(){
        System.out.println("VRRRIIIIIIINHEEEEE!!!");
    }


}