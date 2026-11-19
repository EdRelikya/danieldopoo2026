package DeusExMachina;

public class IngressoOnline extends Ingresso implements Reembolsavel{


    public IngressoOnline(String evento, double precoBase) throws ValorInvalidoException{
        super(evento, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
       return getPrecoBase();
    }


    @Override
    public double aplicarReembolso(double percentual) {
       double precoFinal = calcularPrecoFinal();
       return precoFinal * (percentual / 100);

    }
    
    
    
}
