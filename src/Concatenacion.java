public class Concatenacion {
    static void main(String[] args) {
        String nombre = "Homero";
        String apellido = "Simpson";
        int Valor = 100;
        String Palabra1 = "Apeprendiendo", Palabra2 = "java";
        String saludo = Palabra1+" "+ Palabra2;

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre completo: " + nombre +" "+ apellido);
        System.out.println("Valor: " + Valor);
        System.out.println(saludo);
        System.out.println(Palabra1.concat(Palabra2));
    }
}
