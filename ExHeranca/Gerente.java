package ExHeranca;
public class Gerente extends Funcionario{

    private String departamento;



    Gerente(String departamento, String nome, String cpf, String salario){
        this.departamento = departamento;
        super(nome, cpf, salario);

    }



}