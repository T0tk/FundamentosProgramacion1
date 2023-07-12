package programas;

public class Ejemplo1 {
    public static void main(String[] args) {
        //AFP: 17%
        //ONP:12 %
        String aporte = "Afp";
        aporte= aporte.toUpperCase();
        double sueldo=5000;
        double aporteMensual=0;
        double netoMensual=0;
        ///Nuevo mensaje
        if(aporte.equals("AFP")){
            aporteMensual = sueldo*0.17;
            netoMensual = sueldo - aporteMensual;
        } else if (aporte.equals("ONP")) {
            aporteMensual = sueldo*0.12;
            netoMensual = sueldo - aporteMensual;
        }

        System.out.println("El sueldo del trabajador es: " + sueldo);
        System.out.println("El trabajdor aporta a: " + aporte);
        System.out.println("El factor de aporte es: " + aporteMensual/sueldo);
        System.out.println("El aporte mensual es: "+ aporteMensual);
        System.out.println("El sueldo neto mensual es: "+ netoMensual);

    }
}
