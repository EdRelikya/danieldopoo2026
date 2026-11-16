package AtividadeLista3.Q8;

public class MainQ8 {

    public static void main(String[] args) {





        try {

            Produto pd1 = new Produto("Pao", 0.30, 20);
            System.out.println("Produto cadastrado com sucesso!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        }
        
        try{

        Produto pd1 = new Produto("", 0.30, 20);

        }
        catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());

        }


        try {

            Produto pd2 = new Produto("Pao", 0, 20);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        }




        try {

            Produto pd3 = new Produto("Pao", 0.30, -1);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        }
        
    }
    
}
