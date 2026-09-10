package Estudando;


public class GameApp {
    public static void main(String[] args) {
        
    


    Jogador jg = new Jogador("Ed", "Mago",123456);
    Inimigo ing = new Inimigo("Goblin", "Guerreiro", 30);


    System.out.println("Nome jogador: " + jg.getNome());
    System.out.println("Classe Jogador: " + jg.getClasse());
    System.out.println("ID Jogador: " + jg.getid());
    System.out.println("Vida atual: " + jg.getVidaAtual());
    System.out.println("Recebendo 30 de dano... Vida atual: " + jg.getReceberDano(30));
    System.out.println("Esta vivo?" + jg.getEstaVivo());
    jg.atacar();



    System.out.println("-----------------------------");
    System.out.println("Nome Inimigo: " + ing.getNome());
    System.out.println("Classe Inimigo: " + ing.getClasse());
    System.out.println("Vida atual: " + ing.getVidaAtual());
    System.out.println("Recebendo 30 de dano... Vida atual: " + ing.getReceberDano(30));
    ing.atacar();





    }
  

}
