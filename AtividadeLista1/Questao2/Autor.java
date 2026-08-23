package AtividadeLista1.Questao2;

public class Autor {


    String nome;
    String nacionalidade;

    Autor(String n, String nacio){
        this.nome = n;
        this.nacionalidade = nacio;
    }

     @Override
        public String toString(){
        return nome + ", Nacionalidade: " + nacionalidade;
    }
    
}
