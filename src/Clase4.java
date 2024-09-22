public class Clase4 {
    public static void main(String[] args) {
        int matriz[][]={{1,2,9},{4,5,8}, {7,8,9}};

        calcularMinimo(matriz);
    }
    //Recibe una matriz y retorna el indice de columna que suma mas
    public static void sumaMas(int matriz[][]) {
        int sumaMax=Integer.MIN_VALUE;
        int colMax=-1;
        for (int j=0; j<matriz[0].length; j++) {
            int suma=0;
            for (int i=0; i<matriz.length; i++) {
                suma += matriz[i][j];
                }
            if (suma>=sumaMax) {
                sumaMax = suma;
                colMax =j;
            }

        }
        System.out.println(sumaMax + " es la suma y la col " + colMax);
    }

    public static void sumaMasV2(int matriz[][]) {
        int sumaCols[] = new int[matriz[0].length];
        for (int i=0; i<matriz[0].length; i++) {
            for (int j=0; j<matriz.length; j++) {
                sumaCols[j] += matriz[i][j];
            }
        }
        int sumaMax = Integer.MIN_VALUE;
        int colMax = -1;
        for(int i=0; i<sumaCols.length; i++) {
            //if
        }
    }
    //Insertar numero en un array ordenado de menor a mayor
    public static void agregarNumero(int matriz[][], int numero) {
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (numero<matriz[i][j]) {
                    int aux = matriz[i][j];
                    matriz[i][j] = numero;
                    numero = aux;
                }
            }
        }
    }

    public static int[] calcularMinimo(int matriz[][]) {
        int res[] = new int[2];//pos0: min pos1: cant
        res[0] = Integer.MAX_VALUE;
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j]<res[0]) {
                    res[0] = matriz[i][j];
                    res[1] = 1;
                } else {
                    if (matriz[i][j]==res[0]) {
                        res[1]++;
                    }
                }
            }
        }
        System.out.println(res[0]);
        return res;//Probarla
    }

    public static boolean minimosIguales(int matriz1[][],int matriz2[][]) {
        boolean iguales=false;
        int resMat1[] = calcularMinimo(matriz1);
        int resMat2[] = calcularMinimo(matriz2);

        if (resMat1[1]==resMat2[1]) {
            for (int i=0; i<matriz1.length && iguales; i++) {
                for (int j=0;j< matriz1[i].length && iguales; j++) {
                    //if ((matriz1[i][j] == resMat1[0] && matriz2[i][j])) terminar
                }
            }
        }




        return iguales;
    }
    //Donde hay ceros convertir fila y columnas en ceros
}
