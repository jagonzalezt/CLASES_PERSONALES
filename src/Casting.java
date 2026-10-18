import java.util.stream.Stream;

public class Casting {
    static void main(String[] args) {
        //de texto a entero
        String numeroTexto = "123";
        int numeroEntero = Integer.parseInt(numeroTexto);
        System.out.println("Numero entero: "  + numeroEntero);

        //Entero a texto
        int numeroEntero2 = 456;
        String enteroTexto = String.valueOf(numeroEntero2);
        System.out.println("Texto: " + enteroTexto);

        //doble a entero
        double numeroDouble = 45.59;
        int doubleEntero = (int)numeroDouble;
        System.out.println("Double a entero "+doubleEntero);

        //de entero a doble
        int Entero2 = 212;
        double enteroDouble = (double)Entero2;
        System.out.println("Entero a double "+ enteroDouble);


    }
}
