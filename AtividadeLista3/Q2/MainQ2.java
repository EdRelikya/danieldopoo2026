package AtividadeLista3.Q2;

public class MainQ2 {

    public static void main(String[] args) {
        

        FormaGeometrica[] formas = new FormaGeometrica[3];

        formas[0] = new Circulo(2);
        formas[1] = new Retangulo(12, 6);
        formas[2] = new Triangulo(12, 6);



        for(FormaGeometrica f : formas){
            System.out.println(f.calcularArea());
        }

    }
    
}
