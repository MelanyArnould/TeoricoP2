import java.util.Arrays;

public class Clase2 {
    public static void main(String[] args) {
        int listaNum[] = {5,2,4,1,2,1,34,4};
        //System.out.println(bubbleSort(Arrays.toString(listaNum)));

    }
    /*
    Arrays: son tipados, hay que definir su largo al momento de crearlo.
    Todos los elementos de un array deben ser del mismo tipo de dato, no le puedo pasar un dato distinto
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
    //Recibe un array y retorna el promedio
    public static double promedioVector(int lista[]){
        int suma = 0;
        for (int i=0; i<lista.length; i++) {
            suma += lista[i];
        }
        return (suma/lista.length);
    }

    public static boolean cantidadImpar(int[] datos) {
        int cantidad = 0;
        /*
        for (int num: datos) {
        }
         */
        for (int i=0; i<datos.length; i++) {
            if (datos[i]==1){
                cantidad++;
            }
        }
        return cantidad%2 != 0;
    }

    public static boolean cantidadImparV2(int[] datos) {
        boolean esImpar = true;

        for (int num: datos) {
            if (num == 1) {
                esImpar = !esImpar;
            }
        }
        return esImpar;
    }

    public static int cantidadMinimaMover(int[] pilas) {
        int sumaMovimientos = 0;
        int largo = 0;
        int sumaPilas = 0;
        for (int num: pilas) {
            sumaPilas += num;
        }
        largo = (sumaPilas/pilas.length);
        for (int num : pilas) {
            int movimiento = Math.abs(num-largo);
            if (movimiento >= 0 ) {
                sumaMovimientos += movimiento;
            }
        }
        return sumaMovimientos;
    }

    public static int numeroDel1Al100(int[] numeros) {
        int numEncontrado = -1;
        for(int i=1; i<=100; i++) {
            boolean esta = false;
            for(int j=0; j<numeros.length && !esta; j++) {
                if(numeros[j] == i) {
                    esta = true;
                }
            }
            if (!esta) {
                numEncontrado = i;
            }
        }
        return numEncontrado;
    }

    public static int numeroDel1Al100V2(int[] numeros) {
        boolean numerosEncontrados[] = new boolean[101];
        for(int i=0; i<numeros.length; i++) {
            int num = numeros[i];
            numerosEncontrados[num] = true;
        }
        int numeroEn = -1;
        for(int i=1;i<=100; i++) {
            if(!numerosEncontrados[i]) {
                numeroEn = i;
            }
        }
        return numeroEn;
    }
    //Bubble sort
    public static void bubbleSort(int[] lista) {
        boolean estaOrdenado = false;
        for(int i=0; i<lista.length-1 && !estaOrdenado; i++) {
            estaOrdenado = true;
            for(int j=0; j<lista.length-1-i; j++) {
                if(lista[j+1] < lista[j]) {
                    int aux = lista[j+1];
                    lista[j+1] = lista[j];
                    lista[j] = aux;
                    estaOrdenado = false;
                }
            }
        }
    }
    //Selection sort

}
