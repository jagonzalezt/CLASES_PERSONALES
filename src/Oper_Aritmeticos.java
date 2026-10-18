import java.util.Scanner;

public class Oper_Aritmeticos {
    static void main(String[] args) {
        int valor1, valor2, resultado;

        //Operador suma
        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("INGRESE VALOR1... ");
        valor1 = entrada.nextInt();
        System.out.println("INGRESE VALOR2... ");
        valor2 = entrada.nextInt();

        //Opreracion suma
        resultado = valor1 + valor2;
        System.out.println("El resultado de la suma es: " + resultado);

        //Operacion resta
        resultado = valor1 - valor2;
        System.out.println("El resultado de la resta es: " + resultado);

        //Operacion Multiplicacion
        resultado = valor1 * valor2;
        System.out.println("El valor de la multiplicacion es " + resultado);

        //Operacion Divicion
        resultado = valor1 / valor2;
        System.out.println("El valor de la resta es " + resultado);

        //Operacion residuo
        resultado = valor1 % valor2;
        System.out.println("El valor de el residuo es " + resultado);
    }
}
