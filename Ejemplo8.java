package programas;

public class Ejemplo8 {
    public static void main(String[] args) {
        String[] codigos = {"MO00100614520170013","SI12011519220140012",

                "SM05122514520162573","VI01061917120127351",

                "SM02053210220180312","MO08041908820169815"};

        String codigo = "MO00100614520170013";
        String sede = "MO";

        int jugadores = cantJugadores(codigo);
        System.out.println("La cantidad de figuritas de tipo jugador es: "+jugadores);

        //2.	Dado un arreglo de códigos, identificar cuantos álbumes pertenecen a una sede determinada.
        int sedes = cantSedes(codigos,sede);
        System.out.println("La cantidad de albumes por sede es: "+ sedes);

        //3.	Dado un arreglo de códigos, identificar el código del alumno que tiene
        // la mayor cantidad de figuras en una determinada sede.
//11-19
        int alumno = cantAlumnos(codigos,sede);
        System.out.println("La cantidad de alumno por sede es: "+ alumno);

        //4.	Dado un arreglo de códigos, identificar cuantos álbumes tienen menos de 250 figuras en total.
        int albumes = cantAlbumes(codigos);
        System.out.println("La de albumes menores a 250 es: "+ albumes);
    }

    private static int cantJugadores(String codigo){
        int cantidad = 0;

        cantidad = Integer.parseInt(codigo.substring(8,11));

        return cantidad;
    }

    private static int cantSedes(String[] codigos, String sede){
        int cantidad = 0;

        for (int i=0;i<codigos.length;i++){
            if(codigos[i].substring(0,2).equals(sede)){
                cantidad++;
            }
        }

        return cantidad;
    }

    private static int cantAlumnos(String[] codigos, String sede){
        int cantidad = 0;

        int valor = 0;

        for (int i=0;i<codigos.length;i++){
            if(codigos[i].substring(0,2).equals(sede)){
                int numero = Integer.parseInt(codigos[i].substring(2,4) +codigos[i].substring(4,6) +codigos[i].substring(6,8) +codigos[i].substring(8,11));
                if (numero > cantidad){
                    cantidad = numero;
                    valor = i;
                }
            }
        }
        int estudiante = Integer.parseInt(codigos[valor].substring(11,19));
        return estudiante;
    }

    private static int cantAlbumes(String[] codigos){
        int cantidad = 0;

        for (int i=0;i<codigos.length;i++){
            int numero = Integer.parseInt(codigos[i].substring(2,4)) +Integer.parseInt(codigos[i].substring(4,6)) +Integer.parseInt(codigos[i].substring(6,8)) +Integer.parseInt(codigos[i].substring(8,11));
            if (numero < 250){
                cantidad++;
            }
        }

        return cantidad;
    }

}
