package programas;

public class ActividadGrupal2parte2 {
    public static void main(String[] args) {
        int numero = 1111;
        int apuesta = 1111;

        //a.	Un método que permita determinar si es que la jugada tiene todos los dígitos iguales.
        String digitosIguales = encontrarRepetidos(numero);
        System.out.println("La jugada tiene todos sus digitos iguales es: " + digitosIguales);

        //b.	Un método que permita determinar si es que el jugador obtuvo el premio mayor.
        String premioMayor = obtuvoPremioMayor(numero,digitosIguales);
        System.out.println("La jugada gano el premio mayor: "+ premioMayor);

        //c.	Si un jugador obtiene el premio mayor, su apuesta se multiplica de la siguiente manera:
        int premioTotal = calcularPremioTotal(numero,apuesta,premioMayor);
        System.out.println("El total del premio mayor es: "+ premioTotal);
    }

    private static String encontrarRepetidos(int numero){
        String cumple = "Si";
        int ultimoDigito = 0;
        int nuevoNumero = 0;

        if (numero<1000){
            cumple = "No";
        }

        while (cumple.equals("Si") && numero>9){
            ultimoDigito = numero % 10;
            nuevoNumero = numero / 10;

            if (ultimoDigito!=nuevoNumero%10){
                cumple = "No";
            }
            numero = numero/10;
        }

        return cumple;
    }

    private static String obtuvoPremioMayor(int numero, String digitosIguales){
        String cumple = "No";
        int digito = 7;

        if (digitosIguales.equals("Si") && digito == numero%10){
            cumple = "Si";
        }

        return cumple;
    }

    private static int calcularPremioTotal(int numero, int apuesta, String premioMayor){
        int premio = 0;

        if (premioMayor.equals("Si")){
            if (numero>99999){
                premio = apuesta*10;
            } else if (numero>9999) {
                premio = apuesta*6;
            } else if (numero>999) {
                premio = apuesta*4;
            }
        }

        return premio;
    }
}


