public class Clase9 {

    public static void main(String[] args) {

        int matriz[][]={{1,2,3},{3,3,6},{7,8,9}};
        //matrizAcumulada(matriz);
        //separadoPor3V2(matriz);

        String oracion = "Hola que tal como estas";
        String[] palabras1 = {"Hola", "tal", "como", "estas", "casa"};
        String[] palabras2 = {"Hola","casa", "que", "tal", "como", "estas", "casa"};
        String[] arrOracion =oracion.split("[ ,?]+");

        for (int i=0; i<arrOracion.length; i++) {
            System.out.print(arrOracion[i] + " ");
        }
        verificarV2(palabras2, oracion);

    }
    //Practicamos para el parcial

    //Se puede armar la oracion que se ingreso con las palabras en el array? Estan juntas en el array?
    public void verificar(String[] palabras, String oracion){
        String[] arrOracion = oracion.split(" ");
        boolean esta = true;
        int index = -1;
        boolean seguidos = true;
        for (int i = 0; i<arrOracion.length && esta; i ++) {
            esta = false;
            for (int j = 0; j< palabras.length; j++) {
                if (arrOracion[i].equals(palabras[j])) {
                    esta = true;
                    if (index>j) {
                        seguidos = false;
                    } else {
                        seguidos = false;
                    }
                    index = j;
                }
            }
        }
    }

    public static void verificarV2(String[] palabras, String oracion) {
        String[] arrOracion = oracion.split(" ");
        boolean esta = true;
        boolean ordenados = true;
        int index = -1;

        for (int i = 0; i< arrOracion.length && esta; i++){
            boolean encontre = false;
            for (int j = 0; j< palabras.length; j++){
                if (arrOracion[i].equals(palabras[j])) {
                    encontre = true;
                    if (index>j) {
                        ordenados = false;
                    }
                    index = j;
                }

            }
            if (!encontre) {
                esta = false;
            }
        }
        String orden = "no esta ordenado";
        if (esta){
            if (ordenados){
                orden = "esta ordenado";
            }
            System.out.println("Esta la oracion, "+ orden);
        } else {
            System.out.println("No esta la oracion");
        }
    }


    //Metodo que muestre la matriz cin sus valores acumulados
    public static int[][] matrizAcumulada(int mat[][]) {
        int matAcumulada[][] = new int[mat.length][mat[0].length];
        int anterior = 0;
        for (int i=0; i< mat.length; i++) {
            for (int j=0; j< mat[i].length; j++) {
                matAcumulada[i][j] = anterior += mat[i][j];
                System.out.print(matAcumulada[i][j] + " ");
            }
            System.out.println();
        }
        return matAcumulada;
    }
    //Metodo que retorne si en la matriz hay 3 numeros que esten separados por una distancia de 3 exactamente, a partir de la matriz original
    public static boolean separadoPor3V2(int[][] mat) {
        boolean encontre = false;
        int contador = 0;
        for (int i=0; i<mat.length && !encontre; i++) {
            for (int j=0; j<mat[i].length && !encontre; j++) {
                if (mat[i][j] == 3) {
                    contador++;
                } else {
                    if (contador == 3){
                        encontre = true;
                    }
                    contador = 0;
                }
            }
        }
        System.out.println(encontre);
        return encontre;
    }
    /*
    .add
    .get
    .size
    .remove
    .indexOf
    .equals
    .contains

     */

}
