/******************************************************************************

EXERCICIO 4
**************************************************************************/
import java.util.Scanner;

public class Main {

    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            
                if (isPar(numero)) {
                    System.out.println("número par");
                } else {
                    System.out.println("número ímpar");
                }
        }
    }
}

