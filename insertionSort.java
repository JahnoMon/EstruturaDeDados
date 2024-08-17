import java.util.Scanner;

public class insertionSort {

    public static void insertionSort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; ++i) {
            int key = array[i];
            int j = i - 1;

            System.out.println("Chave: " + key);
            System.out.print("Estado Atual: ");
            printArray(array);

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                array[j] = key;
                j -= 1;

                printArray(array);
            }

            array[j + 1] = key;

            if (i < length - 1)
                System.out.println();
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

        insertionSort(array);

        System.out.println("");
        System.out.print("Resultado Final: ");
        printArray(array);
    }
}

