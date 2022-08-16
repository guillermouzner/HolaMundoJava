public class Condicionales {
    public static void main(String[] args) {
        // numeroIf es positivo o negativo
        int numeroIf = 10;
        if (numeroIf>0){
            System.out.println("El numero ingresado es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El numero ingresado es igual a cero");
        } else {
            System.out.println("El numero ingresado es negativo");
        }

        // bucle while => numeroWhile < 3
        int numeroWhile = 0;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // bucle Do while
        int numeroDoWhile = 0;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile=3;
        } while (numeroDoWhile < 3);

        // bucle for
        for (int numeroFor = 0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }

        // switch case
        String estacion = "verano";
        switch (estacion){
            case("primavera"):
                System.out.println("estamos en primavera");
                break;
            case("verano"):
                System.out.println("estamos en verano");
                break;
            case("otoño"):
                System.out.println("estamos en otoño");
                break;
            case("invierno"):
                System.out.println("estamos en invierno");
                break;
            default:
                System.out.println("debe ingresar una estacion valida");
        }
    }

}
