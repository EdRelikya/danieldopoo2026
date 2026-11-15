package AtividadeLista3.Q2;

public class Retangulo extends FormaGeometrica{

    private double altura;
    private double base;


    public Retangulo (double altura, double base){
        this.altura = altura;
        this.base = base;
    }


    @Override
    public double calcularArea() {
       return base * altura;
    }
    
}
