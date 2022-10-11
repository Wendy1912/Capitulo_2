// Ejercicio 2.35
// Cree una aplicación que calcule su costo diario al conducir su automóvil, de modo que 
//pueda estimar cuánto dinero puede ahorrar si comparte los viajes en automóvil, lo cual también tiene otras ventajas, como la reducción de las emisiones de carbono y la reducción de la congestión de tráfico. La aplicación debe 
//recibir como entrada la siguiente información y mostrar el costo por día para el usuario por conducir al trabajo:
//a) Total de kilómetros conducidos por día.
//b) Costo por litro de gasolina.
//c) Promedio de kilómetros por litro.
//d) Cuotas de estacionamiento por día.
//e) Peaje por día.

import java.util.Scanner;

public class Ejercicio2_35
{
    public static void main(String[]args)
    {
        int a;
        int b;
        int c;
        int d;
        int e;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\"Ingresa solo valores enteros\"");
        System.out.print("Ingresa el total de kilometros conducidos por dia: ");
        a = entrada.nextInt();
        System.out.print("Ingresa el costo por litros de gasolina: ");
        b = entrada.nextInt();
        System.out.print("Ingresa el promedio de kilometros por litro: ");
        c = entrada.nextInt();
        System.out.print("Ingresa las cuotas de estacionamiento por dia: ");
        d = entrada.nextInt();
        System.out.print("peaje por dia: ");
        e = entrada.nextInt();

        System.out.printf("%s %f", "El costo diario de conducir su automovil es:", ((a/c)*b*1.0)+d+e);
    }
}
