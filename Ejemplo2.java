package programas;

public class Ejemplo2 {
    public static void main(String[] args) {
        int sueldoBrutoMensual = 1000;
        int utilidades = 0;
        int cantidadSueldos = 14;
        int UIT = 3600;
        int operacion1 = 0, operacion2 = 0;
        double impuesto = 0;


        operacion1 = (sueldoBrutoMensual*cantidadSueldos) + utilidades;
        operacion2 = operacion1 - (7*UIT);
        impuesto = 0.21 * operacion2;

        if (impuesto<0){
            impuesto = 0;
        }

        System.out.println(impuesto);
    }
}
