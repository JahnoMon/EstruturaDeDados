import java.io.*;
import java.util.*;

public class Quicksort {

    public static void quicksort(int[] array, int menor, int maior) {
        if (menor < maior) {
            int pivotIndex = particao(array, menor, maior);
            System.out.println("Pivot: " + array[pivotIndex]);

            System.out.printf("Partition(A,%d,%d): ", menor + 1, maior + 1);
            for (int i = menor; i <= pivotIndex - 1; i++) {
                System.out.print(array[i] + " ");
            }

            System.out.print("<= " + array[pivotIndex] + " <");

            for (int i = pivotIndex + 1; i <= maior; i++) {
                System.out.print(" " + array[i]);
            }

            System.out.println();
            System.out.print("Estado atual de A: ");
            printArray(array);
            System.out.println();

            quicksort(array, menor, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, maior);
        }
    }

    public static int particao(int[] array, int menor, int maior) {
        int pivot = array[maior];
        int i = menor - 1; 

        for (int j = menor; j < maior; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[maior];
        array[maior] = temp;

        return i + 1;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] array = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        System.out.printf("\nEstado inicial: ");
        printArray(array);
        System.out.println();

        quicksort(array, 0, array.length - 1);

        System.out.print("Resultado Final: ");
        printArray(array);
    }
}
