package AtividadeLista3.Q3;

public class MainQ3 {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("Daniel", 100);
        ContaPoupanca cp1 = new ContaPoupanca("Daniel", 100);

        
        System.out.println("Titular " + cc1.getTitular());
        System.out.println("Saldo Atual conta corrente: " + cc1.getSaldo());
        cc1.sacar(50);
        System.out.println("Saque 50,00 conta corrente, saldo atual: " + cc1.getSaldo());


        System.out.println("-------------------------SAQUE------------------------");

        System.out.println("Saldo Atual conta poupanca: " + cp1.getSaldo());
        cp1.sacar(50);
        System.out.println("Saque 50,00 conta poupanca, saldo atual: " + cp1.getSaldo());




        System.out.println("-----------------------DEPOSITO--------------------");


        System.out.println("Saldo Atual conta corrente: " + cc1.getSaldo());
        cc1.depositar(50);
        System.out.println("Deposito 50,00 conta corrente, saldo atual: " + cc1.getSaldo());

        System.out.println("-------------------------x------------------------");

        System.out.println("Saldo Atual conta poupanca: " + cp1.getSaldo());
        cp1.depositar(50);
        System.out.println("Deposito 50,00 conta poupanca, saldo atual: " + cp1.getSaldo());


    }
    
}
