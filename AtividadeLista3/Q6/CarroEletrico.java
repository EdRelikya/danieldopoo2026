package AtividadeLista3.Q6;

public class CarroEletrico extends Veiculo implements Eletrico{


    public CarroEletrico(String modelo, int velocidadeAtual){
        super(modelo, velocidadeAtual);
    }


    @Override
    public void acelerar() {
        setVelocidadeAtual(getVelocidadeAtual() + 15);
        
    }


    @Override
    public void carregarBateria() {
        System.out.println("Bateria carregada!");
        
    }
    
}
