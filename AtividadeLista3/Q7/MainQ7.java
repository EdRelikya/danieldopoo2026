package AtividadeLista3.Q7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainQ7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
           
            System.out.println("Numero 1");
            int n1 = sc.nextInt();
          
            System.out.println("Numero 2");
            int n2 = sc.nextInt();
         
            int divisao = n1 / n2;
            System.out.println("Divisao: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }
          catch (InputMismatchException e){
            System.out.println("Digite apenas número!");
        }
          finally{
            System.out.println("Operação encerrada!");

        }
    }
}