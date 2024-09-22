public class Clase3 {
    public static void main(String[] args) {
        int matriz[][]={{1,2,3},{4,5,6}, {7,8,9}};
        mostrarMatriz(matriz);
        mostrarMaximoPorFila(matriz);
        sumaDeLaDiagonalPrincipal(matriz);
        sumaDeLaTriangularSuperior(matriz);
    }

    /*
    Una matriz es un array de arrays
    se compone de un array principal que tendra las filas
    {
    f0{}
    f1{}
    f2{}
    }
    el conteo comienza desde el 0

    Creacion de matriz:
    int mat[][] = new int [4](filas)[3](columnas)
    int mat[][] = {{1,2,3}, {4,5,6}, {7,8,9}}
    De esta ultima forma podemos crear una matriz con filas de diferentes largos
    Mostrar elemento con sus coordenadas: int num = mat[0](fila)[1](columna);
    Asignar valor a un elemento de la matriz: mat[0](fila)[1](columna) = 5;

     */

    //Encontrar elementos lideres (Mayor a los de la derecha)
    public static void elementosLideres(int[] lista){
        int max=lista[lista.length-1];
        for (int num:lista) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("El lider es: " + max);
    }
    public static void elementosLideresV2(int[] lista) {
        int lider;
        boolean esLider = true;
        for (int i=0; i<lista.length-1; i++) {
            for (int j=i+1; i<lista.length && esLider; j++) {
                if (lista[i]<=lista[j]) {
                    esLider = false;
                }
            }
            if (esLider) {
                System.out.println(lista[i]);
            }
        }
    }

    public static void mostrarMatriz(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarMaximoPorFila(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            int max = Integer.MIN_VALUE;//Tambien se podria inicializar con el primer elemento de la fila

            for(int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j]>max) {
                    max = matriz[i][j];
                }

                System.out.print("maximo en fila " + i + " es " + max);
            }
            System.out.println();
        }
    }

    public static void sumaDeLaDiagonalPrincipal(int matriz[][]) {
        int suma=0;
        for (int i=0; i<matriz.length; i++) {
            suma+=matriz[i][i];
        }
        System.out.println("La suma de la diagonal principal es: " + suma);
    }

    public static void sumaDeLaTriangularSuperior(int matriz[][]) {
        int suma = 0;
        for(int i=0; i< matriz.length; i++) {
            for(int j=i; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma es: "+ suma);

    }

    /*Costo de origen a destino
   Dest Uru Arg Bra Chi
Orig    0   1   2   3
Uru 0  50  120  50  130
Arg 1  70  70   79  190
bra 2 490  50   80  115
Chi 3 180  130  200  90

De brasil a chile: 115dol

     */
    public static void vueloVC(int costos[][], int origen, int destino) {
        boolean conEscala = false;
        int precio = costos[origen][destino];
        for (int i=0; i<costos.length; i++) {
            int costo = costos[origen][i] + costos[i][destino];
            if (costo < precio) {
                precio = costo;
                conEscala = true;
            }
        }
        if (conEscala) {
            System.out.println("El vuelo mas barato es con escala y sale: " + precio);
        } else {
            System.out.println("El vuelo mas barato es sin escala y sale: " + precio);
        }
    }
}
