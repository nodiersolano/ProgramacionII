/* Programa que lee tres n�meros distintos
 * y nos dice cu�l de ellos es el mayor
 */
import java.util.Scanner;

public class mayordetres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        /*
         * aqui se solicita la entrada de los numeros
         */
        System.out.print("Introduzca primer n�mero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo n�mero: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer n�mero: ");
        n3 = sc.nextInt();
        /*
         * operaccion que define el numero mayor
         */
        if (n1 > n2) {
            if (n1 > n3)
            	/*
            	 * imprime el numero mayor
            	 */
            {
                System.out.println("El mayor es: " + n1);                                             
            } else {
                System.out.println("el mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
        }
    }
}
