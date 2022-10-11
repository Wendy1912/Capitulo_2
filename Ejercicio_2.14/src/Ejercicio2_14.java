// Ejercicio 2.14
//Escriba una aplicación que muestre los números del 1 al 4 en la misma línea, con cada par de números adyacentes separado por un espacio. Use las siguientes técnicas:
// usar println, print y printf

public class Ejercicio2_14
{
    public static void main(String[]args)
    {
        System.out.println("1 2 3 4");
        System.out.print("1");
        System.out.print(" 2");
        System.out.print(" 3");
        System.out.print(" 4\n");
        System.out.printf("%s %s %s %s %n","1","2","3","4");
    }
}