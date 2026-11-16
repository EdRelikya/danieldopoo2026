package AtividadeLista3.Q10;

public class Conta {

    private int numero;
    private double saldo;

    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }


    public double getSaldo(){
        return saldo;
    }


    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {

        if (valor <= 0) {
    throw new IllegalArgumentException("Valor deve ser maior que zero.");
    }

    if (destino == null) {
        throw new IllegalArgumentException("Destino nao encontrado");
    }

    if (saldo < valor) {
    throw new SaldoInsuficienteException("Saldo insuficiente");
    }

    saldo -= valor;
    destino.saldo += valor;

    }

    
}
