import java.util.Scanner;

public class insertionSortDesempenho {

    static int trocas = 0;
    static int comparacoes = 0;

    public static void insertionSort(int[] array) {

        int length = array.length;

        for (int i = 1; i < length; ++i) {
            int key = array[i];
            int j = i - 1;

            comparacoes++;

            while (j >= 0 && array[j] > key) {

                trocas++;
                comparacoes++;
                array[j + 1] = array[j];
                array[j] = key;
                j -= 1;
            }

            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(", ");

        int[] array = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        insertionSort(array);
        System.out.println("Array ordenado:");
        printArray(array);
        System.out.println("Quantidade de trocas: " + trocas);
        System.out.println("Quantidade de comparacoes: " + comparacoes);
    }
}
