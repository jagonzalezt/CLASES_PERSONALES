import java.util.Scanner;

public class Input_Datos {
    static void main(String[] args) {
        String nombre;
        int edad;

        //ingreso de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre:... ");
        nombre = entrada.next(); //.next es para texto.
        System.out.println("Ingresa tu edad:... ");
        edad = entrada.nextInt(); //.nextInt es para numeros.

        //Salida de datos
        System.out.println("El nombre registrado es: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
