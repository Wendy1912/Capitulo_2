//Ejercicio 2.15
//Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números 
//del usuario e imprima la suma, producto, diferencia y cociente (división) de los números.

import java.util.Scanner;

public class Ejercicio2_15
{
    public static void main (String[]args)
    {
        int a;
        int b;

        Scanner entrada = new Scanner(System.in);

        System.out.print("ingresa el primer numero: ");
        a = entrada.nextInt();
        System.out.print("ingresa el segundo numero: ");
        b = entrada.nextInt();

        System.out.println("La suma es: " + (a+b));
        System.out.println("El producto es: " + (a*b));
        System.out.println("La diferencia es: " + (a-b));
        System.out.println("El cociente es: " + (a/b));
    }
}
