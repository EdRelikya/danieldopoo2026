package sGaragem;

public class Veiculo {

    private String placa, modelo;
    private double velocidadeAtual = 0;
    private double velocidadeMaxima;


    Veiculo(String placa, String modelo, double velocidadeMaxima){
        this.placa = placa;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public String getPlaca(){
        return placa;
    }
    public String getModelo(){
        return modelo;
    }
    public double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }    

    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }


    public String acelerar(double incremento){
        velocidadeAtual = Math.min(velocidadeMaxima, incremento + velocidadeAtual);
        return getModelo() + " esta a " + velocidadeAtual + " km/hr";
    }

    public String buzinar(){
        return "bip bip";
    }


}
