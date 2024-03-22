
import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        int atual = 0;
        int anterior = 1;
        int entrada;
        System.out.println("Descubra se o número pertence a sequência de Fibonacci!\nDigite um número:");
        Scanner ler = new Scanner(System.in);
        entrada = ler.nextInt();
        System.out.print(atual + ", ");
        while (entrada > atual) {

            atual = atual + anterior;
            anterior = atual - anterior;

            System.out.print(atual + ", ");
        }
        System.out.print("\n");
        if (entrada == 0) {

            System.out.println("O número " + entrada + " faz parte da sequência de Fibonacci. \nO próximo número é " + (entrada + 1));

        } else if (entrada == atual) {
            System.out.println("O número " + entrada + " faz parte da sequência de Fibonacci. \nO próximo número é o " + (entrada + anterior));

        } else {
            System.out.println("Numero nao faz parte");

        }
    }
}
