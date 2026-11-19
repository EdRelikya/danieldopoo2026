package DeusExMachina;

public abstract class Ingresso {

    private String evento;
    private double precoBase;


    public Ingresso(String evento, double precoBase) throws ValorInvalidoException{

        if (precoBase <= 0) {
            throw new ValorInvalidoException("Erro, valor invalido" + precoBase );
            
        }

        this.evento = evento;
        this.precoBase = precoBase;

    }


    public double getPrecoBase(){
        return precoBase;
    }

    public String getEvento(){
        return evento;
    }


    public abstract double calcularPrecoFinal();
    
    
}
