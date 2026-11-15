package AtividadeLista3.Q6;

public class MainQ6 {

    public static void main(String[] args) {
        Carro c1 = new Carro("Classic", 0);
        CarroEletrico ce1 = new CarroEletrico("BYD", 0);


        
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Velocidade atual: " + c1.getVelocidadeAtual() + "km/hr");
        System.out.println("Acelerando...");
        c1.acelerar();
        System.out.println("Velocidade atual: " + c1.getVelocidadeAtual() + "km/hr");


        System.out.println("-----------------------------");


        System.out.println("Modelo: " + ce1.getModelo());
        ce1.carregarBateria();
        System.out.println("Velocidade atual: " + ce1.getVelocidadeAtual() + "km/hr");
        System.out.println("Acelerando...");
        ce1.acelerar();
        System.out.println("Velocidade atual: " + ce1.getVelocidadeAtual() + "km/hr");


    }
    
}
