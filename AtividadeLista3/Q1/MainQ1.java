package AtividadeLista3.Q1;

public class MainQ1 {
    public static void main(String[] args) {
        
        FuncionarioCLT f1Clt = new FuncionarioCLT("Wesley", 1400);
        FuncionarioPJ f1Pj = new FuncionarioPJ("Eduarda", 1600);


        System.out.println(f1Clt.calcularSalario());
        System.out.println(f1Pj.calcularSalario());


    }
    
}
