package programas;

public class EP2 {
    public static void main(String[] args) {
        int[][] arregloMult = new int[3][4];

        arregloMult[0][1] = 4;  //cambia el valor en la fila 0, columna 1 a 4


        int x = arregloMult[2][2]; //guarda el valor de la fila 2, columna 2 en la variable x


        for (int i = 0; i < arregloMult.length; i++) {
            for (int j = 0; j < arregloMult[i].length; j++) {
                System.out.print(arregloMult[i][j] + " ");
            }
            System.out.println();
        }

        //Arrays multidimensionales
        int[][][][][]  nc = new  int[24][31][12][2999][21];
    }
}
