package programas;

public class Ejemplo3 {
    public static void main(String[] args) {
        int examenOral=96, examenEscrito=96;
        int nivel = 0, precio = 0;

        if(examenEscrito>95 && examenOral>75){
            nivel = 3;
            precio = 400;
        } else if (examenEscrito>95 && examenOral <= 75) {
            nivel = 2;
            precio = 250;
        } else if (examenEscrito<=95) {
            nivel = 1;
            precio = 150;
        }

        System.out.println("Su nivel es: " + nivel + " Y el precio es: " + precio);
    }
}
