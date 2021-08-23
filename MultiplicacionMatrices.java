
import java.util.Scanner;

public class MultiplicacionMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamaño de filas de la primer matriz: ");
        int fi1a1 = sc.nextInt();
        System.out.println("ingrese el tamaño de columnas de la primer matriz: ");
        int co1umna1 = sc.nextInt();
        System.out.println("ingrese el tamaño de filas de la segunda matriz: ");
        int fila2 = sc.nextInt();
        System.out.println("ingrese el tamaño de columnas de la segunda matriz: ");
        int columna2 = sc.nextInt();

        if (co1umna1 == fila2) {
            int[][] matriz1 = new int[fi1a1][co1umna1];
            int[][] matriz2 = new int[fila2][columna2];
            int[][] matrizR = new int[fi1a1][columna2];
            System.out.println("-> ingresa los numeros de la matriz 1");
            for (int i = 0; i < fi1a1; i++) {
                for (int j = 0; j < co1umna1; j++) {
                    System.out.println("Introduce el valor en la posicion " + i + "," + j + ": ");
                    matriz1[i][j] = sc.nextInt();
                }
            }
            //Datos de la Matriz 1
            System.out.println("Matriz 1");
            for (int i = 0; i < fi1a1; i++) {
                for (int j = 0; j < co1umna1; j++) {
                    System.out.print(matriz1[i][j] + " ");
                }
                System.out.println("");
            }
            //Datos de la Matriz 2
            System.out.println("- ingresa los numeros de la matriz dos");
            for (int i = 0; i < fila2; i++) {
                for (int j = 0; j < columna2; j++) {
                    System.out.println("Introduce el valor en la posicion " + i + "," + j + ": ");
                    matriz2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matriz 2");
            for (int i = 0; i < fila2; i++) {
                for (int j = 0; j < columna2; j++) {
                    System.out.print(matriz2[i][j] + " ");
                }
                System.out.println("");
            }
            //Este es la Matriz Resultante
            System.out.println("- Matriz Resultante --");
            for (int i = 0; i < fi1a1; i++) {
                for (int j = 0; j < columna2; j++) {
                    for (int h = 0; h < co1umna1; h++) {
                        matrizR[i][j] = matriz1[i][h] * matriz2[h][j];
                    }
                    System.out.print(matrizR[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Error en la Matrix");
        }

    }
}
