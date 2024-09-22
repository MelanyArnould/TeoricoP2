import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {
        promedio();
    }
    //Promedio de n numeros
    public static void promedio() {
        int suma = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese n: ");
        int n = lector.nextInt();

        for (int i=0; i<n; i++) {
            suma += n;
        }
        if (n!=0) {
            System.out.println("EL promedio es " + (suma/n) );
        } else {
            System.out.println("El promedio es 0");
        }

    }
}
