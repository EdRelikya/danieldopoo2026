package AtividadeLista2;

public class Gato extends Animal {


    Gato(long id, String nome, int idade, double peso){
        super(id, nome, idade, peso);
        habilidades.add("agilidade");

    }


    @Override
    public String emitirSom() {
        return "miau";

    }
    
}
