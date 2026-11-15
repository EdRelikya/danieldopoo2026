package AtividadeLista3.Q5;

public class MainQ5 {

    public static void main(String[] args) {
        Computador pc1 = new Computador();
        Roteador rt1 = new Roteador();
        Televisao tv1 = new Televisao();

        
        pc1.ligar();
        pc1.conectarInternet();
        pc1.desligar();

        System.out.println();

        rt1.ligar();
        rt1.conectarInternet();
        rt1.desligar();

        System.out.println();

        tv1.ligar();
        tv1.desligar();


        /*
         * Uma classe pode implementar varias interfaces porque a interface
         * so define quais metodos a classe deve ter, sem atributos nem codigo.
         * Assim nao ha conflito entre elas, diferente da heranca de classes,
         * que permite so uma classe mae.
         */
    }
    
}
