package Estudando;

public class Jogador extends Personagem {

    private int id;


    Jogador(String nome, String classe, int id){
        super(nome, classe);
        this.id = id;
    }


    public  int getid(){
        return id;
    }

    public  void setid(int id){
        if(id < 0){
            this.id = id;
        }
        else{
            System.out.println("ID Inválido");
        }
    }

 
    @Override
    public void atacar() {
      System.out.println(getNome() + ": Atacou com bola de fogo.");
    }


}
