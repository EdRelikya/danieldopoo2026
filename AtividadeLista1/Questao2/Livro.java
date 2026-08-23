package AtividadeLista1.Questao2;

public class Livro {

    String titulo;
    int anoPublicacao;
    Autor autor;


    Livro(String t, int aP, Autor autor){
        this.titulo = t;
        this.anoPublicacao = aP;
        this.autor = autor;
    }


    @Override
    public String toString(){
        return "Titulo: " + titulo + ", Ano Publicação: " + anoPublicacao + ", Autor: " + autor;
    }
    
}
