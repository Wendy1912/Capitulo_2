//Ejercicio 2.33
//Cree una calculadora del BMI que lea el peso del usuario en libras y la altura en pulgadas (o, si lo prefiere, el peso del 
//usuario en kilogramos y la altura en metros), para que luego calcule y muestre el índice de masa corporal del usuario. 
//Muestre además la siguiente información del Departamento de Salud y Servicios Humanos/Instituto Nacional de 
//Salud para que el usuario pueda evaluar su BMI

import java.util.Scanner;

public class Ejercicio2_33
{
    public static void main(String[]args)
    {
        int a;
        int b;
        int c;
        Scanner entero = new Scanner(System.in);

        System.out.print("Ingresa tu peso en Kilogramos: ");
        a = entero.nextInt();
        System.out.print("Ingresa tu altura en metros: ");
        b = entero.nextInt();

        System.out.printf("%s %f %n", "BMI:", (a*10000.0)/(b*b));
        
        System.out.println("VALORES DE BMI");
        System.out.println("Bajo peso:\tmenos e 18.5");
        System.out.println("Normal:\t\tentre 18.5 y 24.9");
        System.out.println("Sobrepeso:\tentre 25 y 29.9");
        System.out.println("Obeso:\t\t30 a mas");


    }
}
