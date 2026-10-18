public class Oper_Incremento {
    static void main(String[] args) {

       int valor1 = 5;
        System.out.println("Valor original: " + valor1);

        //incremento de valor1 posfijo
        valor1++;   //el sistema puede puede tomar asi  valor1++ lee la variable y luego la suma
        System.out.println("Valor icrementado: " + valor1);

        //incremento de valor1 prefijo
        ++valor1 ;    //el sistema puede puede tomar asi ++valor1 suma la variable antes de leerla
        System.out.println("Valor icrementado: " + valor1);

        valor1+=2; // incrementando el valor de +2
        System.out.println("Valor increm. en 2:  " + valor1);

        //decremento posfijo
        int valor2 = 10;
        System.out.println("Valor original: " + valor2);

        valor2--; //decremento posfijo
        System.out.println("Valor decremento: " + valor2);

        --valor2; //decremento prefijo
        System.out.println("Valor decremento posfijo: " + valor2);

        valor2-=3; //decremento -3
        System.out.println("Valor decremento prefijo -3: " + valor2);

        int valor3 = 20;
        System.out.println("Valor original " + valor3);

        //Operador incremento fijo (multiplicacion)
        valor3*=9;
        System.out.println("Valor incrementado " + valor3);

        //Operador incremento fijo (Divicion)
        valor3/=2;
        System.out.println("Valor incrementado " + valor3);


    }
}
