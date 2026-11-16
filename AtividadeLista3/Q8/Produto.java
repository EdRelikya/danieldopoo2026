package AtividadeLista3.Q8;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;


    public Produto (String nome, double preco, int quantidade){
        
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode ser vazio.");
        }

        if (preco <= 0) {
            throw new IllegalArgumentException("Preco deve ser maior que zero.");
        }

        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade nao pode ser negativa.");
        }


        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }




}
