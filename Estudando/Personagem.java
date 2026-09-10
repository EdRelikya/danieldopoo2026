package Estudando;

public class Personagem {

    private String nome, classe;
    protected  Vida vida;



    Personagem(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
        this.vida = new Vida();
    }

    public String getNome(){
        return nome;
    }

    public String getClasse(){
        return classe;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public  void setclasse(String classe){
        this.classe = classe;
    }


        public int getVidaAtual(){
        return vida.getVida();

    }

    public int getReceberDano(int quantidade){
        return vida.receberDano(quantidade);
    }

    public boolean getEstaVivo(){
        return vida.estaVivo();
    }

    public  int getCurar(int quantidade){
        return vida.curar(quantidade);
    }


    public void atacar(){
        System.out.println(nome + ": Ataque base!");
    }
    
}
