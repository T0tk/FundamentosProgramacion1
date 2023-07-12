package programas;

public class Pregunta2 {
    public static void main(String[] args) {

        //generar numero random
        double numero_generado = 7775.0;
        double monto_apostado = 100;

        System.out.println("El numero generado es: "+ numero_generado);

        //validar igualdad de caracteres
        boolean todos_iguales = verificarIgualdad(numero_generado);
        System.out.println("Todos los digitos iguales: " + todos_iguales);

        boolean premio_mayor = verificarPremioMayor(numero_generado);
        System.out.println("Premio mayor: " + premio_mayor);

        double premio_total = verificarMontoPremioMayor(numero_generado, premio_mayor, monto_apostado);
        System.out.println("El premio total a pagar es de: "+ premio_total);


    }//main

    private static double verificarMontoPremioMayor(double numeroGenerado, boolean premioMayor, double monto_apostado) {
        double premio_total = 0;
        if(premioMayor){
            int numero = (int) numeroGenerado;
            String str_numero = Integer.toString(numero);
            int len_str_numero = str_numero.length();

            switch(len_str_numero){
                case 4:
                    premio_total = monto_apostado * 4;
                    break;
                case 5:
                    premio_total = monto_apostado * 6;
                    break;
                case 6:
                    premio_total = monto_apostado * 10;
                    break;
                default:
                    System.out.println("La cantidad de digitos es incorrecta");
                    break;

            }
        }else{
            premio_total= 0;
        }
        return premio_total;
    }

    private static boolean verificarPremioMayor(double numeroGenerado) {
        int numero = (int) numeroGenerado;
        String str_numero = Integer.toString(numero);
        int len_str_numero = str_numero.length();
        int q_igualdades = contarIgualdades(numeroGenerado);
        boolean premio_mayor = false;
        System.out.println(str_numero.charAt(0));
        System.out.println(q_igualdades);

        if(str_numero.charAt(0) == '7' && q_igualdades == len_str_numero){
            premio_mayor = true;
        }

        return premio_mayor;
    }

    private static boolean verificarIgualdad(double numeroGenerado) {

        int q_igualdades = contarIgualdades(numeroGenerado);
        int numero = (int) numeroGenerado;
        String str_numero = Integer.toString(numero);
        int len_str_numero = str_numero.length();
        boolean todos_iguales = false;

        if(q_igualdades == len_str_numero){
            todos_iguales = true;
        }
        return todos_iguales;

    } //verificar igualdad

    private static int contarIgualdades(double numeroGenerado) {
        int numero = (int) numeroGenerado;
        String str_numero = Integer.toString(numero);
        int len_str_numero = str_numero.length();
        char[] numeros = new char[len_str_numero];
        int contador = 0;
        int q_igualdades = 0;

        //poner los valores en un arreglo
        for(int i = 0; i < len_str_numero; i++){
            numeros[i] = str_numero.charAt(i);
            //System.out.println(numeros[i]);
        } //for

        while(contador < len_str_numero){
            if(numeros[0] == numeros[contador]){
                q_igualdades++;
            }
            contador++;
        }

        return q_igualdades;
    }


   
}
