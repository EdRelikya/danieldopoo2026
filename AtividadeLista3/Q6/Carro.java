package AtividadeLista3.Q6;

public class Carro extends Veiculo {


    public Carro(String modelo, int velocidadeAtual){
        super(modelo, velocidadeAtual);
    }


    @Override
    public void acelerar() {
        setVelocidadeAtual(getVelocidadeAtual() + 10);
        
    }
}
