package AtividadeLista2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        Zoologico zl = new Zoologico();

        int opcao = 0;

        while (opcao != 6) {

            System.out.println("1 - Adcionar Animal");
            System.out.println("2 - Listar Animal");
            System.out.println("3 - Remover Animal");
            System.out.println("4 - Emitir Som");
            System.out.println("5 - Testar Habilidade");
            System.out.println("6 - Sair");

            System.out.println("Digite número opção");
            opcao = sc.nextInt();


        }

    }
}