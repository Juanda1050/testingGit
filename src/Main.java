import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int N1 = sc.nextInt();
        System.out.print("Ingrese otro numero: ");
        int N2 = sc.nextInt();
        int suma = N1 + N2;
        System.out.println("La suma es de: "+suma);
        int resta = N1 - N2;
        System.out.println("La resta es de: "+resta);
        int multi = N1 * N2;
        System.out.println("La multiplicacion es de: "+multi);
        int division = N1 / N2;
        System.out.println("la division es de: "+division);
        for (int i = 1; i < 11; i++)
        {
            int tabla = i * N1;
            System.out.println(tabla);
        }
    }
}
