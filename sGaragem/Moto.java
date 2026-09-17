package sGaragem;

public class Moto extends Veiculo{

    Moto(String placa, String modelo, double velocidadeMaxima){
        super(placa, modelo, velocidadeMaxima);

    }

    public String buzinar(){
        return "vrum vrum";
    }
    
}
