import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-----Calculadora-------");
        System.out.println("Digete um numero: ");
        int N1 = input.nextInt();
        System.out.println("Digite outro numero: ");
        int N2 = input.nextInt();
        System.out.println("Agora o sinal operacional: ");
        String sinal = input.next();

        if(sinal.equals("+")){
            System.out.println("o resultado é " + (N1 + N2) );
        }if(sinal.equals("-")){
            System.out.println("o resultado é " + (N1 - N2) );
        }if(sinal.equals("/")){
            System.out.println("o resultado é " + (N1 / N2) );
        }if(sinal.equals("*")){
            System.out.println("o resultado é " + (N1 * N2) );
        }
    }
}
