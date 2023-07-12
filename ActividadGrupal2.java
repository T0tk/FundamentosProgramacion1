package programas;

import javax.imageio.plugins.tiff.TIFFDirectory;

public class ActividadGrupal2 {
    public static void main(String[] args) {
        int capital = 10000;
        double tasaInteresInicial = 0.01;
        int tiempo = 35 ;

        //a.	Desarrollar un método para calcular el porcentaje del interés en el último mes
        double tasaInteresFinal = tasaInteresFinal(tiempo,tasaInteresInicial);
        System.out.println("El porcentaje de interes del ultimo mes es: " + tasaInteresFinal*100 + "%");

        //b.	Desarrollar un método para calcular el importe del interés ganado en el último mes
        double InteresFinal = interesFinal(capital,tasaInteresFinal,tiempo);
        System.out.println("El importe del interes ganado en el ultimo mes es: " + InteresFinal);

        //c.	Desarrollar un método para calcular el importe total (incluye los intereses)
        double valorFinal = calcularValorFinal(capital,tasaInteresFinal,tiempo);
        System.out.printf("El importe del total es:  %.2f \n", valorFinal);
    }

    private static double tasaInteresFinal(int tiempo, double tasaInteresInicial) {
        double porcentaje = 0;
        int contador = 0;

        if(tiempo>=36){
            contador = tiempo/36;
        }

        porcentaje = tasaInteresInicial + 0.005*contador;
        return porcentaje;
    }

    private static double interesFinal(int capital, double tasaInteresFinal, int tiempo){
        double interes = 0;

        interes = capital*tasaInteresFinal*tiempo;

        return interes;
    }

    private static double calcularValorFinal(int capital, double tasaInteresFinal, int tiempo){
        double valorFinal = 0;
        double parte1 = 0;

        parte1 = 1+(tasaInteresFinal*tiempo);
        valorFinal = parte1 * capital;

        return  valorFinal;
    }
}
