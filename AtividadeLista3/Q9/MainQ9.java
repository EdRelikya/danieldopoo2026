package AtividadeLista3.Q9;

public class MainQ9 {

    public static void main(String[] args) {

        Livro lv = new Livro("Narnia", 2);


        try{
            lv.emprestar();
            System.out.println("Emprestimo realizado.");
        }
        catch(LivroIndisponivelException e){
            System.out.println("Erro: " + e.getMessage());

        }



        try {
            lv.emprestar();
            System.out.println("Emprestimo realizado.");
        } catch (LivroIndisponivelException e) {
            System.out.println("Erro: " + e.getMessage());

        }



        try {
            lv.emprestar();
            System.out.println("Emprestimo realizado.");
        } catch (LivroIndisponivelException e) {
            System.out.println("Erro: " + e.getMessage());

        }


    }
    
}
