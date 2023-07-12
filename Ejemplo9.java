package programas;

import java.util.Arrays;

public class Ejemplo9 {
    public static void main(String[] args) {
        int digito = 4;
        String[] placas = {"AGX123","BGX837","IUR923","YRS623","PSO998","MWR836"};
        String[] vehiculos = {"Camion","Auto","Auto","Bus","Bus","Auto"};

        //-	Dado un dígito, determinar cuántos vehículos tiene la placa que termina con dicho dígito.
        int vehiculosDigito = calcularVehiculos(digito,placas);
        System.out.println("La cantidad de vehiculos que terminan en ese digito es: "+ vehiculosDigito);

        //-	Cuál es el tipo de vehículos que menos transita en estas vías
        // (Nota: Considerar que sólo habrá 1 tipo de vehículo que menos transite).
        String menosTransita = calcularMenosTransitado(vehiculos);
        System.out.println("El tipo de vehiculo menos transitado es: "+ menosTransita);

        //-	Devolver un listado con las placas de todos aquellos vehículos que tengan sticker verde o rojo.
        String[] listaPlacas = obtenerListaDePlacas(placas);
        System.out.println("Vehiculos sticker verde son: "+ Arrays.toString(listaPlacas));
    }

    private static int calcularVehiculos(int digito, String[] placas){
        int cantidad = 0;

        for(int i=0;i< placas.length;i++){
            if (placas[i].substring(5,6).equals(digito)) {
                cantidad++;
            }
        }

        return cantidad;
    }

    private static String calcularMenosTransitado(String[] vehiculos){
        String tipo = "";
        int camion = 0;
        int auto = 0;
        int bus = 0;

        for (int i=0;i<vehiculos.length;i++){
            if (vehiculos[i].equals("Camion")){
                camion++;
            } else if (vehiculos[i].equals("Auto")) {
                auto++;
            } else if (vehiculos[i].equals("Bus")) {
                bus++;
            }
        }

        if (camion<auto && camion<bus){
            tipo ="Camion";
        } else if (auto<camion && auto<bus) {
            tipo="Auto";
        } else if (bus<camion && bus<auto ) {
            tipo="Bus";
        }

        return tipo;
    }

    private static String[] obtenerListaDePlacas(String[] placas){
        String[] listado = new String[placas.length];
        String[] numeros = {"5","6","7","8"};
        
        for(int i=0;i< placas.length;i++){
            int digito = Integer.parseInt(placas[i].substring(5,6));
           if ( digito >=5 && digito<=8){
                listado[i] += placas[i];
           }
        }

        return listado;
    }
}
