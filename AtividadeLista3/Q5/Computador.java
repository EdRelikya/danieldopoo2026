package AtividadeLista3.Q5;

public class Computador implements Ligavel, Conectavel {

    @Override
    public void ligar() {
        System.out.println("Computador Ligado");

    }

    @Override
    public void desligar() {
        System.out.println("Computador Desligado");

    }

    @Override
    public void conectarInternet() {
        System.out.println("Computador Conectado à Internet");

    }
    
}
