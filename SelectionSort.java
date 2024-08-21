import java.io.*;
import java.util.*;

public class SelectionSort {

	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int menorIndice = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[menorIndice]) {
					menorIndice = j;
				}
			}

			int aux = array[menorIndice];
			array[menorIndice] = array[i];
			array[i] = aux;

			System.out.println("Menor elemento neste passo: " + array[i]);
            System.out.print("Estado Atual: ");
			printArray(array);
			System.out.println("");
		}
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

		selectionSort(array);

		System.out.print("Resultado Final: ");
		printArray(array);
	}
}
