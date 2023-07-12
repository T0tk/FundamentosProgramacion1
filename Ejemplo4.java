package programas;

public class Ejemplo4 {
    public static void main(String[] args) {
        //Datos de entrada o valores de prueba
        String tViaje = "Internacional";
        double km = 27000.0;
        String tCliente = "Normal";
        String dia = "Domingo";

        //Crear mÃ©todo para obtener primera bonificaciÃ³n
        double factor1 = calcularBonificacion1(tViaje,km);
        System.out.printf("La primera bonificaciÃ³n es %.2f \n", factor1);

        //Crear mÃ©todo para obtener segunda bonificaciÃ³n
        double factor2 = calcularBonificacion2(tCliente);
        System.out.printf("La segunda bonificaciÃ³n es %.2f \n", factor2);

        //Crear mÃ©todo para obtener tercera bonificaciÃ³n
        double factor3 = calcularBonificacion3(dia);
        System.out.printf("La tercera bonificaciÃ³n es %.2f \n", factor3);

        //Crear un mÃ©todo para calcular el total de kilÃ³metros
        double total = calcularTotal(tViaje,km,tCliente,dia);
        System.out.printf("El total de kilÃ³metros es %.2f \n", total);
    }

    private static double calcularTotal(String tViaje, double km, String tCliente, String dia) {
        double totalKm = 0.0;
        double bono1 = calcularBonificacion1(tViaje, km)/100.0;
        double bono2 = calcularBonificacion2(tCliente)/100.0;
        double bono3 = calcularBonificacion3(dia)/100.0;

        double bonoTotal = km * bono1 + km * bono2 + km * bono3;
        totalKm = km + bonoTotal;
        return totalKm;
    }

    private static double calcularBonificacion3(String dia) {
        double factor = 0.0;
        if (dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles")){
            factor = 20.0;
        }else if (dia.equals("Jueves") || dia.equals("Viernes")){
            factor = 15.0;
        }else if (dia.equals("Sabado") || dia.equals("Domingo")){
            factor = 10.0;
        }
        return factor;
    }

    private static double calcularBonificacion2(String tCliente) {
        double factor = 0.0;
        if(tCliente.equals("Normal")){
            factor = 10.0;
        }else if(tCliente.equals("Preferencial")){
            factor = 12.0;
        }else if(tCliente.equals("VIP")){
            factor = 20.0;
        }
        return factor;
    }

    private static double calcularBonificacion1(String tViaje, double km) {
        double factor = 0.0;
        if(tViaje.equals("Nacional")){
            if(km <= 10000){
                factor = 10.61;
            }else if(km > 10000 && km <= 16000){
                factor = 20.52;
            }else if(km > 16000 && km <= 18000){
                factor = 30.43;
            }else if(km > 18000){
                factor = 40.11;
            }
        }else if(tViaje.equals("Internacional")){
            if(km <= 25000){
                factor = 45.34;
            }else if(km > 25000 && km <= 30000){
                factor = 55.25;
            }else if(km > 30000 && km <= 45000){
                factor = 65.16;
            }else if(km > 45000){
                factor = 75.13;
            }
        }
        return  factor;
    }
}