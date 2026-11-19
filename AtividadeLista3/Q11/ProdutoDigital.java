package AtividadeLista3.Q11;

public class ProdutoDigital extends Produto implements Descontavel{



    public ProdutoDigital(String nome, double precoBase) throws PrecoInvalidoException{
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }


    @Override
    public double aplicarDesconto(double percentual) {   
        double precoFinal = calcularPrecoFinal();
        return precoFinal * (1 - percentual / 100);
    }

    
    
}
