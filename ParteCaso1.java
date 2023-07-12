package programas;

public class ParteCaso1 {
    public static void main(String[] args) {
        //Datos de entrada
        String dia = "Jueves";
        String tipoEntrada = "Premium";
        String combo = "Combo1";
        String tarjeta = "Si";

        //Crear metodo para determinar el precio a pagar por entrada
        double entrada = precioEntrada(dia,tipoEntrada);
        System.out.printf("El precio a pagar por entrada es: %.2f \n", entrada);


        //Crear metodo para determinar el precio a pagar segun el tipo de combo
        double comida = precioCombo(combo);
        System.out.printf("El precio a pagar del combo es: %.2f \n", comida);


        //Crear metodo para determinar el monto a pagar si un cliente quiere una entrada mas un combo
        // y si el cliente tiene la tarjeta de fidelizacion (Si o No)
        double total = descuentoTarjeta(tarjeta,entrada,comida);
        System.out.printf("El precio total a pagar es: %.2f \n", total);
    }

    private static double precioEntrada(String dia,String tipoEntrada) {
        double precio = 0.0;
        if(tipoEntrada.equals("Normal")){
            if(dia.equals("Martes")){
                precio = 8.0;
            } else if (dia.equals("Jueves")) {
                precio = 16.0;
            } else {
                precio = 12.0;
            }
        } else if (tipoEntrada.equals("Premium")) {
            if(dia.equals("Martes")){
                precio = 16.0;
            } else if (dia.equals("Jueves")) {
                precio = 32.0;
            } else {
                precio = 24.0;
            }
        }

        return precio;
    }

    private static double precioCombo(String combo) {
        double precio = 0.0;

        if(combo.equals("Combo1")){
            precio = 10.0;
        } else if (combo.equals("Combo2")) {
            precio = 12.5;
        } else if (combo.equals("Combo3")) {
            precio = 13.0;
        } else if (combo.equals("Combo4")) {
            precio = 16.0;
        }

        return precio;
    }

    private static double descuentoTarjeta(String tarjeta, double entrada, double comida) {
        double precio = entrada + comida;
        double porcentaje = 0.0;
        if (tarjeta.equals("Si")){
            porcentaje = precio * 0.05;
            precio = precio - porcentaje;
        }
        return precio;
    }
}
