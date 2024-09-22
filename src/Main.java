import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejemploMaximo();
    }
    /*
    int para valores enteros
    short para enteros pequeños
    long para enteros mas grandes
    float para numeros decimales
    double para decimales de menor tamaño
    String para textos
    char para caracteres
    boolean para valores booleanos

    A partir de la version 10 de java se puede declarar una variable con var y el mismo inferira
    el tipo de dato.

    Cuando se opera con los mismos tipos, el resultado sera del mismo (int 2 + int 3)/2 = 2
    Cuando se opera con distintos tipos, el resultado sera el del mas grande (int 2 + double 3)/2 = double 2.5

    Casting: fuerzo el tipo de variable, se podrian perder datos. (int 2 + double 3)/2 = (int)2
    int i = 2;
    int j = 3;
    double k = (i + (float)j)/2 = 2.5

    Las conversiones se pueden hacer por:
    asignacion
    promocion aritmetica(int 2 + double 3)/2 = double 2.5
    casting

    Orden de precedencia: ! && ||

    Estructuras de control:

    while (condicion) {
        codigo
    }

    do {
        codigo
    } while (condicion)
     */


    public static void  ejemploMaximo() {
        int max = Integer.MIN_VALUE;
        int dato;
        boolean huboDatos = false;
        String respuesta;
        System.out.println("Quiere ingresar algo? (S por si)");
        Scanner lector = new Scanner(System.in);
        respuesta = lector.nextLine();
        while (respuesta.equals("S")) {
            huboDatos = true;
            System.out.println("ingrese dato");
            dato = lector.nextInt();
            lector.nextLine();// Agregamos para que consuma el enter
            if (dato > max) {
                max = dato;
            }
            System.out.println("Mas datos?");
            respuesta = lector.nextLine();
        }
        if (huboDatos) {
            System.out.println("El maximo es " + max);
        } else {
            System.out.println("No hubo datos");
        }
    }

    /*
    Todos los elementos de un array deben ser del mismo tipo de dato
    El tamaño de un array es fijo, al momento de definirlo se debe asignar el largo de este
    Definir un array de extension 4
    int[] datos = new int[4];
    int datos[] = new int[4];
    int cantidad = 4;
    int datos[] = new int[cantidad];
    Si ya sabemos los datos:
    String[] diasDeClase = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"}; //Nos queda un array con 5 elementos.
    Asignar elemento:
    datos[1] = 45;
    datos[0] = 115;
    Mostrar por pantalla el valor en determinada posicion:
    System.out.println(datos[0]);
    Largo:
    int largo = datos.length;
    */


}