
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int[] consumos = new int[10];

        int total = 0;
        int mayor = 0;
        int sectorMayor = 0;

        for (int i = 0; i < consumos.length; i++) {
            int valor;
            do {
                System.out.println("Ingrese el consumo del sector " + (i + 1) + ":");
                valor = lector.nextInt();
                if (valor < 0) {
                System.out.println("ERROR, el numero no puede ser negativo");
                }
            } while (valor < 0);

            consumos[i] = valor;
            total = total + consumos[i];

            if (i == 0) {
                mayor = consumos[i];
                sectorMayor = i + 1;
            } else if (consumos[i] > mayor) {
                mayor = consumos[i];
                sectorMayor = i + 1;
            }
        }

        double promedio = (double) total / consumos.length;

        int sobreElPromedio = 0;
        int rachaActual = 0;
        int rachaMayor = 0;

        for (int i = 0; i < consumos.length; i++) {
            if (consumos[i] > promedio) {
                sobreElPromedio++;
                rachaActual++;
                if (rachaActual > rachaMayor) {
                    rachaMayor = rachaActual;
                }
            } else {
                rachaActual = 0;
            }
        }
        System.out.println("------------------------------------");
        System.out.println("    Consumo de agua por sectores    ");
        System.out.println("------------------------------------");
        System.out.println("Consumo total: " + total);
        System.out.println("Promedio: " + promedio);
        System.out.println("Sector con mayor consumo: " + sectorMayor);
        System.out.println("Mayor consumo: " + mayor);
        System.out.println("Sectores sobre el promedio: " + sobreElPromedio);
        System.out.println("Racha mas larga: " + rachaMayor);
        System.out.println("------------------------------------");

        System.out.println();
        System.out.println("--------------------");
        System.out.println("  Lista de Consumo  ");
        System.out.println("--------------------");

        for (int i = 0; i < consumos.length; i++) {
            System.out.println("-Sector " + (i + 1) + ": " + consumos[i]);
        }

        System.out.println("--------------------");
        lector.close();
    }
}

