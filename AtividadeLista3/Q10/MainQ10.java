package AtividadeLista3.Q10;

public class MainQ10 {

    public static void main(String[] args) {
        Conta c1 = new Conta(1, 1000);
        Conta c2 = new Conta(2, 1000);



        System.out.println("Conta 1 Saldo atual: " + c1.getSaldo());
        System.out.println("Conta 2 Saldo atual: " + c2.getSaldo());

        System.out.println("-----------------------------------------");


        try{
            c1.transferir(c2, 100);
            System.out.println("Transferencia realizada.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }


        try {
            c1.transferir(c2, -100);
            System.out.println("Transferencia realizada.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }


        try {
            c1.transferir(c2, 1000);
            System.out.println("Transferencia realizada.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }



        try {
            c1.transferir(null, 100);
            System.out.println("Transferencia realizada.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }




        System.out.println("Conta 1 Saldo atual: " + c1.getSaldo());
        System.out.println("Conta 2 Saldo atual: " + c2.getSaldo());

        
    }



    
}
