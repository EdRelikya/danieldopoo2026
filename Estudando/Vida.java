package Estudando;

public class Vida {

    private int vida;


    Vida(){
        this.vida = 100;
    }




    public int receberDano(int quantidade){


        this.vida = Math.max(0, vida - quantidade);

        return this.vida;

    }


    public int curar(int quantidade){
        this.vida = Math.min(100, vida + quantidade);

        return this.vida;
    }


    public int getVida(){
        return vida;
    }

    public boolean estaVivo(){
        return  vida > 0;
    }
    
}
