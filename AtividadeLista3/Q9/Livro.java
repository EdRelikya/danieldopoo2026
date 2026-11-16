package AtividadeLista3.Q9;

public class Livro {


    private String titulo;
    private int exemplaresDisponivei;

    public Livro(String titulo, int exemplaresDisponivei){
        this.titulo = titulo;
        this.exemplaresDisponivei = exemplaresDisponivei;

    }

    public void emprestar() throws LivroIndisponivelException {

        if (exemplaresDisponivei == 0) {
            throw new LivroIndisponivelException("nao ha exemplares disponiveis");
            
        }

        exemplaresDisponivei--;

    }
    
}
