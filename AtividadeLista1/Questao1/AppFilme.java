package AtividadeLista1.Questao1;

public class AppFilme {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Interistelar", "Ficção Cientifica", 2014);
        Filme filme2 = new Filme("Toy Story", "Animação", 1995);


        System.out.println("==========FILME 1=========");
        System.out.println("Titulo: "  + filme1.titulo);
        System.out.println("Gênero: "  + filme1.genero);
        System.out.println("Ano Lançamento: "  + filme1.anoLancamento);
        System.out.println();

        System.out.println("==========FILME 2=========");
        System.out.println("Titulo: "  + filme2.titulo);
        System.out.println("Gênero: "  + filme2.genero);
        System.out.println("Ano Lançamento: "  + filme2.anoLancamento);




        
    }
}
