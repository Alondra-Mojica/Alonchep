import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = scanner.nextInt();

        // Suma
        int suma = a + b;
        System.out.println("Suma: " + suma);

        // Resta
        int resta = a - b;
        System.out.println("Resta: " + resta);






        //Division
        int div = a/b;
        if (div <=0){
        System.out.println("La division es " + div);
        } else  {
        System.out.println("No se puede dividir entre cero");
        } 

        scanner.close();

        
    }
}
