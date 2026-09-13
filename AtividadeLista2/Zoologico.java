package AtividadeLista2;
import java.util.ArrayList;

public class Zoologico {

    private ArrayList<Animal> animais;


    Zoologico(){
       this.animais = new ArrayList<Animal>();
    }



    public boolean adicionarAnimal(Animal animal){
        for (Animal a : animais){
            if(a.getId() == animal.getId()){
                return false;
            }
            
        }

        animais.add(animal);
        return true;

    }



    public ArrayList<Animal> listarAnimais(){
        return animais;
    }
    

    public Animal buscarAnimal(long id){
        for(Animal a : animais){
            if (a.getId() == id) {
                return a;
                
            }
        }

        return null;
        
    }

    public boolean removerAnimal(long id){
        for(Animal a : animais){
            if(a.getId() == id){
                animais.remove(a);
                return true;
            }
        }

        return false;
    }
}
