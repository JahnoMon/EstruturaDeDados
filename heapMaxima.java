import java.io.*;
import java.util.*;

public class heapMaxima{
    
     // Função para construir a max-heap a partir do array
    public static void buildMaxHeap(int[] array) {
        int heapSize = array.length - 1; // Define o tamanho da heap como o tamanho do array

        // Percorre do meio para o início do array, aplicando maxHeapify em cada nó pai
        for (int i = (array.length / 2); i >= 1; i--) {
            maxHeapify(array, i, heapSize);
        }
    }
    
    public static void maxHeapify(int[] array, int i, int heapSize) {
        int left = left(i);   // Índice do filho esquerdo
        int right = right(i); // Índice do filho direito
        int largest = i;      // Assume que o nó atual é o maior

        // Verifica se o filho esquerdo é maior que o nó atual
        if (left <= heapSize && array[left] > array[largest]) {
            largest = left;
        }

        // Verifica se o filho direito é maior que o maior valor encontrado até agora
        if (right <= heapSize && array[right] > array[largest]) {
            largest = right;
        }

        // Se o maior valor não está no nó atual, faz a troca e chama maxHeapify novamente
        if (largest != i) {
            swap(array, i, largest);  // Troca A[i] com A[largest]
            maxHeapify(array, largest, heapSize); // Chamada recursiva
        }
    }
    
    // Função para calcular o índice do filho esquerdo
    public static int left(int i) {
        return 2 * i; // Fórmula para o filho esquerdo
    }

    // Função para calcular o índice do filho direito
    public static int right(int i) {
        return 2 * i + 1; // Fórmula para o filho direito
    }
    
     public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void printArray(int[] array){
	    for(int i = 0; i < array.length; i++){
	        System.out.print(array[i]);
	        if(i < array.length - 1){
	            System.out.print(" | ");    
	        }
	    }
	}
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String[] inputArray = input.split(" ");
		int[] array = new int[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {
			array[i] = Integer.parseInt(inputArray[i]);
		}
		
		System.out.print("Estado inici: ");
        printArray(array);
        System.out.println();
		
		buildMaxHeap(array);
		
		System.out.print("Estado final: ");
        printArray(array);
	}
}
