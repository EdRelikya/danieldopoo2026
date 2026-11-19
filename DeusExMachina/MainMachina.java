package DeusExMachina;

public class MainMachina {
    public static void main(String[] args) {
        Ingresso[] in = new Ingresso[3];

        // Tipo específico, para poder chamar aplicarReembolso depois
        IngressoOnline online = null;

        try {
            online = new IngressoOnline("Filme", 20.00);
            in[0] = online;
        } catch (ValorInvalidoException e) {
            System.out.println("~Erro: " + e.getMessage());
        }

        try {
            in[1] = new IngressoPresencial("Show", 50.00);
        } catch (ValorInvalidoException e) {
            System.out.println("~Erro: " + e.getMessage());
        }

        try {
            in[2] = new IngressoOnline("Palestra", 30.00);
        } catch (ValorInvalidoException e) {
            System.out.println("~Erro: " + e.getMessage());
        }

        // Polimorfismo: cada objeto usa o seu calcularPrecoFinal()
        for (Ingresso i : in) {
            if (i != null) {
                System.out.println(i.getEvento() + ": R$ " + i.calcularPrecoFinal());
            }
        }

        // Reembolso só existe no tipo que implementa Reembolsavel
        if (online != null) {
            System.out.println("Reembolso de 50% do Filme: R$ " + online.aplicarReembolso(50));
        }

        // Preço inválido de propósito
        try {
            new IngressoOnline("Defeituoso", -10);
        } catch (ValorInvalidoException e) {
            System.out.println("~Erro ao cadastrar: " + e.getMessage());
        }
    }
}