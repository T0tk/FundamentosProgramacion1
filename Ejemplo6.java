package programas;

public class Ejemplo6 {
    public static void main(String[] args) {
        int clave = 51558;
        int aprobar = cantDigitos(clave);
        int suma = sumaDosDigitos(clave);

        if(aprobar >= 4){
            System.out.println("La clave tiene " + aprobar + " digitos y por lo tanto esta aprobada");
            System.out.println("La suma del tercer y cuarto digitos es: " + suma);
        }

    }

    private static int cantDigitos(int clave){
        int cantidad = 0;

        while (clave>0){
            clave = clave / 10;
            cantidad++;
        }

        return cantidad;
    }

    private static int sumaDosDigitos(int clave){
        int suma = 0;
        int digito = 0;
        int tercerDigito = 0;
        int cuartoDigito = 0;

        while (clave>0){
            digito = clave % 10;

            if(clave < 1000){
                tercerDigito = digito;
            } else if (clave < 10000) {
                cuartoDigito = digito;
            }

            clave = clave / 10;
        }

        suma = tercerDigito + cuartoDigito;
        return suma;
    }
}
