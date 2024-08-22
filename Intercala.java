import java.io.*;
import java.util.*;

public class Intercala {

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
		}
    }
    
    public static Boolean estaOrdenado(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }

	public static void printArray(int[] array){
	    for(int i = 0; i < array.length; i++){
	        System.out.print(array[i]);
	        if(i < array.length - 1){
	            System.out.print(" ");    
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
		
		String input2 = scanner.nextLine();
		String[] inputArray2 = input2.split(" ");
		int[] array2 = new int[inputArray2.length];

		for (int j = 0; j < inputArray2.length; j++) {
			array2[j] = Integer.parseInt(inputArray2[j]);
		}
		
		int[] arraySoma = new int[array.length + array2.length];
		
		System.arraycopy(array, 0, arraySoma, 0, array.length);
		System.arraycopy(array2, 0 , arraySoma, array.length, array2.length);
		
		if (estaOrdenado(array) && estaOrdenado(array2)){
		    selectionSort(arraySoma);    
		    printArray(arraySoma);
		} else{
		    System.out.print(-1);
		} 
	}
}
