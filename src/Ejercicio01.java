
import java.util.Scanner;


public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int consumoTotal = 0;
        double promedio = 0;
        int consumo1 = 100;
        int consumo2 = 67;
        int consumo3 = 55;
        int consumo4 = 34;
        int consumo5 = 62;
        int consumo6 = 73;
        int consumo7 = 163;
        int consumo8 = 126;
        int consumo9 = 184;
        int consumo10 = 250;

        int[] consumos = new int {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} {

            


            for (int i = 0; i < args.length; i++) {

                System.out.println(consumos [1] "Ingrese consumo dia 1", consumo1);
                System.out.println(consumos [2]"Ingrese consumo dia 2", consumo2);
                System.out.println(consumos [3]"Ingrese consumo dia 3", consumo3);
                System.out.println(consumos [4]"Ingrese consumo dia 4", consumo4);
                System.out.println(consumos [5]"Ingrese consumo dia 5", consumo5);
                System.out.println(consumos [6]"Ingrese consumo dia 6", consumo6);
                System.out.println(consumos [7]"Ingrese consumo dia 7", consumo7);
                System.out.println(consumos [8]"Ingrese consumo dia 8", consumo8);
                System.out.println(consumos [9]"Ingrese consumo dia 9", consumo9);
                System.out.println(consumos [10]"Ingrese consumo dia 10", consumo10);


                consumoTotal = consumo1 + consumo2 + consumo3 + consumo4 + consumo5 + consumo6 + consumo7 + consumo8 + consumo9 + consumo10;
                System.out.println("Consumo total: " + consumoTotal);
                promedio = consumoTotal / 10;
                System.out.println("Promedo total: " + promedio);
                }

                
            }

            
        }



        scanner.close();
    }
}
