package ExHeranca;
public class Funcionario{

    private String nome, cpf, salario;


    Funcionario(String n, String cpf, String salario){
        this.nome = n;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setSalario(String salario){
    this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getSalario() {
    return this.salario;
    }



}