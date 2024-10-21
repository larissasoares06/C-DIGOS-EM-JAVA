/******************************************************************************
EXERCICIO 6
*******************************************************************************/
public class Main {
    
    public static int Maior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int Menor(int[] vetor) {
        int menor = vetor[0]; 
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static double media(int[] vetor) {
        int maior = Maior(vetor);
        int menor = Menor(vetor);
        return (maior + menor) / 2.0;
    }

    public static void main(String[] args) {
        int[] num = {5, 3, 8, 1, 4};

        System.out.println("Maior valor: " + Maior(num));
        System.out.println("Menor valor: " + Menor(num));
        System.out.println("Média entre maior e menor: " + media(num));
    }
}
