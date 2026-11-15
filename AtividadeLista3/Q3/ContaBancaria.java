package AtividadeLista3.Q3;

public abstract class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public abstract void sacar(double valor);


    public String getTitular(){
        return titular;
    }
    
}
