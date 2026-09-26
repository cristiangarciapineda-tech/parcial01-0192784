import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int[][] produccion = new int[4][5];

        for (int fila = 0; fila < produccion.length; fila++) {
            for (int columna = 0; columna < produccion[fila].length; columna++) {
                do {
                    System.out.println("Ingrese la produccion de la maquina "
                            + (fila + 1) + " en el dia " + (columna + 1) + ": ");
                    produccion[fila][columna] = lector.nextInt();
                    if (produccion[fila][columna] < 0) {
                        System.out.println("ERROR, la produccion no puede ser negativa");
                    }
                } while (produccion[fila][columna] < 0);
            }
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("   Total producido por maquina   ");
        System.out.println("---------------------------------");

        int mayorMaquina = 0;
        int numeroMaquinaMayor = 1;

        for (int fila = 0; fila < produccion.length; fila++) {
            int totalMaquina = 0;
            for (int columna = 0; columna < produccion[fila].length; columna++) {
                totalMaquina = totalMaquina + produccion[fila][columna];
            }
            System.out.println("Maquina " + (fila + 1) + ": " + totalMaquina);
            if (fila == 0) {
                mayorMaquina = totalMaquina;
                numeroMaquinaMayor = fila + 1;
            } else if (totalMaquina > mayorMaquina) {
                mayorMaquina = totalMaquina;
                numeroMaquinaMayor = fila + 1;
            }
        }

        System.out.println();
        System.out.println("|Total producido por dia|");
        System.out.println();

        int menorDia = 0;
        int numeroDiaMenor = 1;

        for (int columna = 0; columna < 5; columna++) {
            int totalDia = 0;
            for (int fila = 0; fila < 4; fila++) {
                totalDia = totalDia + produccion[fila][columna];
            }

            System.out.println("Dia " + (columna + 1) + ": " + totalDia);
            
            if (columna == 0) {
                menorDia = totalDia;
                numeroDiaMenor = columna + 1;
            } else if (totalDia < menorDia) {
                menorDia = totalDia;
                numeroDiaMenor = columna + 1;
            }
        }

        int cantidadMenores20 = 0;

        for (int fila = 0; fila < produccion.length; fila++) {
            for (int columna = 0; columna < produccion[fila].length; columna++) {
                if (produccion[fila][columna] < 20) {
                    cantidadMenores20++;
                }
            }
        }

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("                    Resultados                ");
        System.out.println("----------------------------------------------");

        System.out.println("Maquina con mayor produccion: " + numeroMaquinaMayor);
        System.out.println("Produccion de la maquina: " + mayorMaquina);
        System.out.println("Dia con menor produccion: " + numeroDiaMenor);
        System.out.println("Produccion del dia: " + menorDia);
        System.out.println("Registros inferiores a 20 piezas: " + cantidadMenores20);
        System.out.println("----------------------------------------------");

        System.out.println();
        System.out.println("                          Matriz de Produccion                    ");
        System.out.println();
        System.out.println("                  Dia1   Dia2   Dia3   Dia4   Dia5        ");

        for (int fila = 0; fila < produccion.length; fila++) {
            System.out.print("Maquina " + (fila + 1) + "   ");
            for (int columna = 0; columna < produccion[fila].length; columna++) {
                System.out.print(produccion[fila][columna] + "      ");
            }
            System.out.println();
        }
        lector.close();
    }
}