package AtividadeLista2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        Zoologico zl = new Zoologico();

        int opcao = 0;

        while (opcao != 6) {

            System.out.println("1 - Adcionar Animal");
            System.out.println("2 - Lista Animal");
            System.out.println("3 - Remover Animal");
            System.out.println("4 - Emitir Som");
            System.out.println("5 - Testar Habilidade");
            System.out.println("6 - Sair");

            System.out.println("Digite número opção");
            opcao = sc.nextInt();



            if (opcao == 1) {
                int tipo = 0;
                System.out.println("Tipo animal: 1- Gato, 2- Cachorro, 3-Passaro: ");
                System.out.println("Digite número opção");
                tipo = sc.nextInt();

                System.out.println("Digite ID Animal");
                long id = sc.nextLong();
                sc.nextLine();
                System.out.println("Digite nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite idade: ");
                int idade = sc.nextInt();
                System.out.println("Digite Peso: ");
                double peso = sc.nextDouble();
                
                
                if (tipo == 1) {
                    Gato gt = new Gato(id, nome, idade, peso);
                    zl.adicionarAnimal(gt);
                    
                }

                else if (tipo == 2) {
                    Cachorro cr = new Cachorro(id, nome, idade, peso);
                    zl.adicionarAnimal(cr);
                    
                }

                else if (tipo == 3) {
                    Passaro ps = new Passaro(id, nome, idade, peso);
                    zl.adicionarAnimal(ps);
                    
                }
            }
            else if (opcao == 2) {
                for(Animal a : zl.listarAnimais()){
                    System.out.println(a.getNome());
                }
                
            }

            else if (opcao == 3) {
                System.out.println("Digite ID Animal");
                long id = sc.nextLong();

                if (zl.removerAnimal(id)) {
                    System.out.println("Animal removido");
                }
                else{
                    System.out.println("ID incorreto");
                }
                
            }

            else if (opcao == 4) {
                System.out.println("Digite ID Animal");
                long id = sc.nextLong();

                Animal animal = zl.buscarAnimal(id);

                if (animal != null) {
                    System.out.println(animal.getNome() + " diz " + animal.emitirSom());
                }
                else if (animal == null) {
                    System.out.println("Animal não encontrado");
                }
                
            }

            else if (opcao == 5) {
                System.out.println("Digite ID Animal");
                long id = sc.nextLong();
                sc.nextLine();
                Animal animal = zl.buscarAnimal(id);

                System.out.println("Digite habilidade");
                String habilidade = sc.next();

                if (animal != null) {
                   System.out.println(animal.realizarHabilidade(habilidade));
                    
                }



            }
            else if (opcao == 6) {
                System.out.println("Saindo do app...");
                
            }

        }

    }
}