

public class Main {
    
    public static void main(String[] args) {
        System.out.println(exibirDiaSemana(10));
        System.out.println(exibirDiaSemana(7));
        System.out.println(exibirDiaSemana(3));
        }
        
    
    public static String exibirDiaSemana(int dia) {
        switch(dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return "Número inválido. Apenas números de 1 e 7.";
        }
    }

    
}
