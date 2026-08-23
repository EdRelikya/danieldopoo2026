package Aulas;
public class Cliente {

    String nome;
    String rg;
    String cpf;
    Telefone telefone;
    Endereco endereco;
    Data data;


    Cliente(String n, String rg, String cpf, Telefone telefone, Endereco endereco, Data data){
        this.nome = n;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.data = data;
    }
    
}
