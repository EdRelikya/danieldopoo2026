package AtividadeLista2;

public class Cachorro extends Animal {


    Cachorro(long id, String nome, int idade, double peso){
        super(id, nome, idade, peso);
        habilidades.add("farejar");
    }


    @Override
    public String emitirSom() {
        return "au";
    }
    
}
