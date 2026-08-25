package AulaEncap;

public class Departamento {
    private int codigo;
    private String nome;


    Departamento(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }


    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    
}
