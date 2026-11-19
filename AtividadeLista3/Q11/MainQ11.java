package AtividadeLista3.Q11;

public class MainQ11 {

    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];

        ProdutoDigital jogo;

        try {
            jogo = new ProdutoDigital("GTA 6", 549.00);

            produtos[0] = new ProdutoFisico("Tablet", 200);
            produtos[1] = jogo; 
            produtos[2] = new ProdutoDigital("Curso", 100);

            for (Produto p : produtos) {
                System.out.println(p.getNome() + ": R$ " + p.calcularPrecoFinal());
            }

            System.out.println("GTA 6 com 20% de desconto: R$ " + jogo.aplicarDesconto(20));

        } catch (PrecoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        
        try {
            new ProdutoFisico("Defeituoso", -10);
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }
}