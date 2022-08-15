
public class Main {
    public static void main(String[] args) {
        int result;
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        result = suma(number1,number2,number3);
        System.out.println("La suma es: "+result);
        //////////////////////
        Coche coche = new Coche();
        coche.incrementarPuertas();
        coche.incrementarPuertas();
        coche.incrementarPuertas();
        coche.incrementarPuertas();
        System.out.println("Numero de puertas: "+coche.numeroDePuertas);
    }

    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 +  num3;
    }
}

class Coche {
    public int numeroDePuertas = 0;

    public void incrementarPuertas(){
        this.numeroDePuertas++;
    }
}