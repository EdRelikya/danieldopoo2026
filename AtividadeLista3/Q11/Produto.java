package AtividadeLista3.Q11;

public abstract class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) throws PrecoInvalidoException {
        if (precoBase <= 0) {
            throw new PrecoInvalidoException("Preço inválido: " + precoBase);
        }
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}