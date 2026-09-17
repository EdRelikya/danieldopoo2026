package sGaragem;

public class Carro  extends Veiculo{


    Carro(String placa, String modelo, double velocidadeMaxima){
        super(placa, modelo, velocidadeMaxima);
    }

    public String buzinar(){
        return "Fom fom";
    }
    
}
