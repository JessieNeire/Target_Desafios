
public class logica {

    public static void main(String[] args) {
        // lógica sequencial: a) 1, 3, 5, 7, ___
        int numA = -1;

        System.out.println("Lógica sequêncial:  Questão A");
        for (int i = 0; i <= 4; i++) {
            numA += 2;
            System.out.print(numA + ", ");
        }
        System.out.print("\n \n");
        //b) 2, 4, 8, 16, 32, 64, ____
        int numB = 2;

        System.out.println("Lógica sequêncial:  Questão B");
        System.out.print(numB + ", ");
        for (int i = 0; i <= 5; i++) {
            numB += numB;
            System.out.print(numB + ", ");
        }
        System.out.print("\n \n");

        //c) 0, 1, 4, 9, 16, 25, 36, ____
        System.out.println("Lógica sequêncial:  Questão C");

        for (int i = 0; i <= 7; i++) {
            System.out.print((i * i) + ", ");
        }
        System.out.print("\n \n");

        //d) 4, 16, 36, 64, ____
        System.out.println("Lógica sequêncial: Questão D");
        System.out.print("2, ");
        for (int i = 2; i <= 11; i += 2) {
            System.out.print((i * i) + ", ");
        }
        System.out.print("\n \n");

        //e) 1, 1, 2, 3, 5, 8, ____
        System.out.println("Lógica sequêncial: Questão E");
        System.out.print(" ");
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i <= 7; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;

            System.out.print(num1 + ", ");
        }
        System.out.print("\n \n");

        //f) 2,10, 12, 16, 17, 18, 19, ____
        /* Não sei como poderia codificar isso, mas a lógica é que todos os número
     presentes começam com a letra "D" */
        System.out.println("Lógica sequêncial: Questão F");
        System.out.println(" 2,10, 12, 16, 17, 18, 19, 200");

    }
}
