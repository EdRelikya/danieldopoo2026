package AtividadeLista3.Q1;

public class FuncionarioCLT extends Funcionario {


    public  FuncionarioCLT (String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.10;
    }
    
}
