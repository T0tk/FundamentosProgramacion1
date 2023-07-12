package programas;

public class Ejemplo7parte2 {
    public static void main(String[] args) {
        String[] codigos = {"AR000101","PE125610","CH452315","BR521317","BR123620","PE752124","AR124511","PE562405","PE562405","BR452102","AR455210"};
        String nacionalidad = "PE";
        int cantidadProductos = cantProductos(codigos,nacionalidad);
        System.out.println("La cantidad de productos peruanos es: " + cantidadProductos);

        int ultimoCorrelativo = maximoCorrelativo(codigos,nacionalidad);
        System.out.println("El maximo correlativo es: " + ultimoCorrelativo);

        int montoAlmacenar = montoAlmacenar(codigos,nacionalidad);
        System.out.println("El monto almacenado es: " + montoAlmacenar);
    }

    private static int cantProductos(String[] codigos, String nacionalidad){
        int cantidad = 0;

        for (int i=0;i<codigos.length;i++){
            if (codigos[i].substring(0,2).equals(nacionalidad)){
                cantidad++;
            }
        }

        return cantidad;
    }

    private static int maximoCorrelativo(String[] codigos, String nacionalidad){
        int maximo = 0;
        String numero = "0";

        for (int i=0;i<codigos.length;i++){
            if (codigos[i].substring(0,2).equals(nacionalidad)){
                for (int j=2; j<6;j++){
                    numero = codigos[i].substring(j,j+1);
                    if (Integer.parseInt(numero) > maximo){
                        maximo = Integer.parseInt(numero);
                    }
                }
            }
        }

        return maximo;
    }

    private static int montoAlmacenar(String[] codigos, String nacionalidad){
        int monto = 0;

        for (int i=0;i<codigos.length;i++){
            if (codigos[i].substring(0,2).equals(nacionalidad)){
               monto = monto + Integer.parseInt(codigos[i].substring(6,8));
            }
        }

        return monto;
    }
}
//AR000101