import java.util.Scanner;

public class Main {

    public static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low - 1) / 2 ;

            System.out.printf("Separando o array V[%d...%d] : %s em V[%d...%d] : %s e V[%d...%d] : %s%n",
                low, high, formatArray(array, low, high),
                low, mid, formatArray(array, low, mid),
                mid + 1, high, formatArray(array, mid + 1, high));

            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);

            merge(array, low, mid, high);
        }
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        System.arraycopy(array, low, left, 0, n1);
        System.arraycopy(array, mid + 1, right, 0, n2);

        int i = 0, j = 0, k = low;

        System.out.printf("Executando o merge nos arrays %s e %s%n",
                formatArray(left, 0, n1 - 1), formatArray(right, 0, n2 - 1));

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < n1) {
            array[k++] = left[i++];
        }

        while (j < n2) {
            array[k++] = right[j++];
        }

        System.out.printf("array ordenado : %s%n", formatArray(array, low, high));
    }

    private static String formatArray(int[] array, int low, int high) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = low; i <= high; i++) {
            sb.append(array[i]);
            if (i < high) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoLista = Integer.parseInt(scanner.nextLine());

        String[] numerosDaLista = scanner.nextLine().split(" ");
        int[] lista = new int[tamanhoLista];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = Integer.parseInt(numerosDaLista[i]);
        }

        mergeSort(lista, 0, lista.length - 1);

        System.out.print("\nO array ordenado : ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            if (i < lista.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
