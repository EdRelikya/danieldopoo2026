package AtividadeLista1.Questao2;

public class Main {

    public static void main(String[] args) {
        
        Autor a1 = new Autor("George Orwell", "Britânico");
        Livro l1 = new Livro("1984", 1949, a1);

        Autor a2 = new Autor("Machado de Assis", "Brasileiro");
        Livro l2 = new Livro("Dom Casmurro", 1899, a2);

        System.out.println(l1);
        System.out.println(l2);



    }
    
}
