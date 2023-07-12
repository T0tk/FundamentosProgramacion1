package programas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejemplo7 {
    public static void main(String[] args) {
        //Datos de prueba
        int[] nacionales = {25000,18600,14400,12000,30000};
        int[] internacionales = {10000,5000,200,800,60000};

        //pregunta 1
        int[] totalXPlato = calcularTotalXPlato(nacionales,internacionales);
        System.out.println("Los totales son: " + Arrays.toString(totalXPlato));

        ///pregunta 2
        int masVendido = calcularMasVendido(totalXPlato);
        System.out.println("Los porcentajes totales de los platos son: " + masVendido);
    }

    private static int[] calcularTotalXPlato(int[] nacionales, int[] internacionales){
        int[] miArreglo = new int[nacionales.length];

        for (int i=0;i<nacionales.length;i++){
            miArreglo[i] = nacionales[i] + internacionales[i];
        }

        return miArreglo;
    }

    private static int calcularMasVendido(int[] totalXPlato){
        int numeroAlto = 0;

        for (int i=0;i<totalXPlato.length;i++){
            if (totalXPlato[i]> numeroAlto){
                numeroAlto = totalXPlato[i];
            }
        }
        return numeroAlto;
    }
}
