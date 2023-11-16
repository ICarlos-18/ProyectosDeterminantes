import java.util.Scanner;

public class CalculadoraDeterminanteMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz cuadrada (por ejemplo, 3 para una matriz 3x3):");
        int tamaño = scanner.nextInt();

        double[][] matriz = new double[tamaño][tamaño];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.printf("Ingrese el elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double determinante = calcularDeterminante(matriz);
        System.out.println("El determinante de la matriz es: " + determinante);

        scanner.close();
    }

    public static double calcularDeterminante(double[][] matriz) {
        int tamaño = matriz.length;

        if (tamaño == 1) {
            return matriz[0][0];
        }

        double determinante = 0;

        for (int columna = 0; columna < tamaño; columna++) {
            determinante += matriz[0][columna] * cofactor(matriz, 0, columna) * Math.pow(-1, columna);
        }

        return determinante;
    }

    public static double[][] submatriz(double[][] matriz, int filaExcluida, int columnaExcluida) {
        int tamaño = matriz.length;
        double[][] submatriz = new double[tamaño - 1][tamaño - 1];
        int filaDestino = 0, columnaDestino = 0;

        for (int fila = 0; fila < tamaño; fila++) {
            for (int columna = 0; columna < tamaño; columna++) {
                if (fila != filaExcluida && columna != columnaExcluida) {
                    submatriz[filaDestino][columnaDestino] = matriz[fila][columna];
                    columnaDestino++;
                    if (columnaDestino == tamaño - 1) {
                        columnaDestino = 0;
                        filaDestino++;
                    }
                }
            }
        }

        return submatriz;
    }

    public static double cofactor(double[][] matriz, int fila, int columna) {
        return calcularDeterminante(submatriz(matriz, fila, columna));
    }
}