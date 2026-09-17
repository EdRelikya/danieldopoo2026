package sGaragem;

public class Caminhao extends Veiculo{

    Caminhao(String placa, String modelo, double velocidadeMaxima){
        super(placa, modelo, velocidadeMaxima);
    }
    

    public String buzinar(){
        return "POO POO";
    }
}
