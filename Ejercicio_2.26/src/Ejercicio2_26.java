// Ejercicio 2.26
//Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e 
//imprima el resultado.

import java.util.Scanner;

public class Ejercicio2_26
{
    public static void main(String[]args)
    {
        int a;
        int b;
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingresa el primer numero (diferente de cero): ");
        a = entrada.nextInt();
        System.out.print("ingresa el segundo numero (diferente de cero): ");
        b = entrada.nextInt();
            if (a%b==0)

            if (a>=b)
                System.out.print(a + " es multiplo de " + b);

            if (a%b!=0)
                System.out.print(a + " no es multiplo de " + b);
    }
}