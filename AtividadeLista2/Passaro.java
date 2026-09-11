package AtividadeLista2;

public class Passaro extends Animal {



    Passaro(long id, String nome, int idade, double peso){
        super(id, nome, idade, peso);
        habilidades.add("voar");
    }
    
    @Override
    public String emitirSom() {
        return "piu";
    }
}
