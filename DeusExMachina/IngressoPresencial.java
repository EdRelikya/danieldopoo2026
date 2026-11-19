package DeusExMachina;

public class IngressoPresencial extends Ingresso{


    public IngressoPresencial(String evento, double precoBase) throws ValorInvalidoException{

        super(evento, precoBase);
    }


    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + 10.00;
    }



    
}
