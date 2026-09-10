package Estudando;

public class Inimigo extends Personagem {

    private int recompensa;

    Inimigo(String nome, String classe, int recompensa){
        super(nome, classe);

    }

    public int getRecompensa(){
        return recompensa;
    }

    public void getRecompensa(int recompensa){
        this.recompensa = recompensa;
    }
    

    public int getVidaAtual(){
        return vida.getVida();
    }

    @Override
    public void atacar() {

        System.out.println(getNome() + ": Ataque com garras");
    }

}
