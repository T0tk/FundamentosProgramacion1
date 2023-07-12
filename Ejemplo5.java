package programas;

public class Ejemplo5 {
    public static void main(String[] args) {
        int numero = 45443;
        int digito = 4;
        int cantDigitos = contarDigitos(numero);
        int cantNumerosRepetidos = encontrarRepetidos(numero,digito);

        System.out.println("El numero total de digitos es: " + cantDigitos);
        System.out.println("La cantidad de numeros repetidos es: " + cantNumerosRepetidos);
    }

    private static int contarDigitos(int numero){
        int repeticion = 0;

        while (numero > 0){
            numero = numero / 10;
            repeticion++;
        }

        return repeticion;
    }

    private static int encontrarRepetidos(int numero, int digito){
        int vecesRepetidas = 0;
        int ultimoDigito = 0;
        while (numero>0){

            ultimoDigito = numero % 10;
            numero = numero / 10;

            if (ultimoDigito == digito){
                vecesRepetidas++;
            }
        }
        return vecesRepetidas;
    }
}
