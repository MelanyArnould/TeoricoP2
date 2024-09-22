public class Clase5 {
    public static void main(String[] args) {
        int matriz[][]={{1,2,9},{4,5,8}, {7,8,9}};


    }
    //Ejercicio convertirEnCeros()
    public static void convertirCeros(int[][] matriz) {

        boolean[] filasConCeros = new boolean [matriz.length];
        boolean[] colConCeros = new boolean [matriz[0].length];

        for (int i=0; i< matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    filasConCeros[i] = true;
                    colConCeros[j] = true;
                }
            }
        }
        for (int i=0; i< matriz.length; i++) {
            for (int j=0; j<matriz[0].length; j++) {
                if (filasConCeros[i] || colConCeros[j]) {
                    matriz[i][j] = 0;
                }
            }
        }

    }
    //Una matriz es punto silla cuando el maypr de esa fila es a su vez el minimo de la columna
    public static boolean esPuntoSilla(int[][] matriz) {
        boolean puntoSilla = false;
        for (int i=1; i<matriz.length && !puntoSilla; i++) {
            int max= Integer.MIN_VALUE;
            int colMax =-1;

            for (int j=1; j<matriz[i].length && !puntoSilla; j++) {
                if (matriz[i][j]> max) {
                    max = matriz[i][j];
                    colMax = j;
                }

            }
            int min = Integer.MAX_VALUE;
            for (int k=0; k<matriz.length && !puntoSilla; k++) {
                if (matriz[i][colMax]<min) {
                    min = matriz[i][colMax];
                }
            }
            if (max == min) {
                puntoSilla = true;
            }
        }
        return puntoSilla;
    }

    public static void colocarBombas(boolean[][] tablero, int cantB) {
        while (cantB > 0) {
            int fila = (int)(Math.random() * tablero.length);
            int col = (int)(Math.random() * tablero[0].length);
            if (!tablero[fila][col]) {
                tablero[fila][col] = true;
                cantB--;
            }
        }
    }
}
