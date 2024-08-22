import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void bubbleSort(int[] array, int nValue){
        int orders = 0;
        do {
            for (int index = 0; index < array.length-1; index++) {
                if (array[index]>array[index+1]) {
                    int aux = array[index];
                    array[index] = array[index+1];
                    array[index+1] = aux;
                }
            }
            orders++;
            System.out.printf("[%d", array[0]);
            for (int outputIndex = 1; outputIndex < array.length; outputIndex++) {
                System.out.printf(", %d", array[outputIndex]);
            }
            System.out.print("]\n");
        } while(orders<nValue);
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mValue = scanner.nextInt();
        int nValue = scanner.nextInt();
        int[] arrayToOrder = new int[mValue]; 
        for (int iterator = 0; iterator < arrayToOrder.length; iterator++) {
            arrayToOrder[iterator] = scanner.nextInt();
        }

        bubbleSort(arrayToOrder, nValue);
        scanner.close();
    }
}
