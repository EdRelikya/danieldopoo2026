package AtividadeLista3.Q5;

public class Roteador implements Ligavel, Conectavel {

 
    @Override
    public void ligar() {
        System.out.println("Roteador Ligado");
        
    }
    
    @Override
    public void desligar() {
        System.out.println("Roteador Desligado");
        
    }

    @Override
    public void conectarInternet() {
        System.out.println("Roteador Conectado à Internet");
        
    }

}
