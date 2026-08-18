public class Cliente {

    String nome;
    String rg;
    String cpf;

    Endereco endereco;


    Cliente(String n, String rg, String cpf, Endereco endereco){
        this.nome = n;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
}
