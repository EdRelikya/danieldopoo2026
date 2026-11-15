package AtividadeLista3.Q6;

public abstract class Veiculo {

    private String modelo;
    private int velocidadeAtual;

    
    public  Veiculo(String modelo, int velocidadeAtual){
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    public abstract void acelerar();


    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual){
     this.velocidadeAtual = velocidadeAtual;
    }


    public String getModelo(){
        return modelo;
    }
    
}
