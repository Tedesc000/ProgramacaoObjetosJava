package avaliacao.formula1;
public class Equipe {
    private String nome;
    private int anoFundacao;
    private Patrocinadores[] patrocinadores;

    public Equipe(){
        this.patrocinadores = new Patrocinadores[10];
    }

    //setters
    public void setEquipe(){
        this.nome = "Ferrari";
        this.anoFundacao = 1929;
        this.patrocinadores = new Patrocinadores[10];
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnoFundacao(int anoFundacao){
        this.anoFundacao = anoFundacao;
    }
    public void setPatrocinadores(Patrocinadores patrocinador, int posicao){
        if(posicao >= 0 && posicao < patrocinadores.length){
            patrocinadores[posicao] = patrocinador;
        }
    }

    //getters
    public String getNome(){
        return this.nome;
    }
    public int getAnoFundacao(){
        return this.anoFundacao;
    }
    public Patrocinadores[] getPatrocinadores(){
        return this.patrocinadores;
    }

    public void exibirDados(){
        System.out.println("Nome da equipe: " + getNome());
        System.out.println("Ano de fundacao da equipe: " + getAnoFundacao());
        System.out.println("Patrocinadores inseridos:\n");
        for(int i = 0; i < patrocinadores.length; i++){
            if(patrocinadores[i] != null){
                System.out.println("Patrocinador " + (i+1) + ":");
                patrocinadores[i].getPatrocinadores();
                System.out.println("-------------------");
            }
        }
    }

    public void listarPatrocinadores(){
        for(int i = 0; i < patrocinadores.length; i++){
            if(patrocinadores[i] != null){
                System.out.println("Patrocinador " + (i+1) + ":");
                patrocinadores[i].getPatrocinadores();
                System.out.println("-------------------");
            }
        }
    }


}
