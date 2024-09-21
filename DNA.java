import java.io.*;
import java.util.*;

public class DNA {

    public static int contarInversoes(String elementos) {
        int inversoes = 0;
        int n = elementos.length();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (elementos.charAt(i) > elementos.charAt(j)) { // isso funciona para strings?
                    inversoes++;
                }
            }
        }
        return inversoes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine().trim());
        scanner.nextLine();

        for (int dataset = 0; dataset < M; dataset++) {
            if (dataset > 0) {
                System.out.println();
            }

            String[] params = scanner.nextLine().trim().split(" ");
            int j = Integer.parseInt(params[0]);
            int k = Integer.parseInt(params[1]);

            List<String> sequencias = new ArrayList<>();
            List<String> ordenadoPorDesordem = new ArrayList<>();

            for (int i = 0; i < k; i++) {
                sequencias.add(scanner.nextLine().trim());
            }

            sequencias.sort((a, b) -> {
                int inversoesA = contarInversoes(a);
                int inversoesB = contarInversoes(b);
                return Integer.compare(inversoesA, inversoesB);
            });

            for (String s : sequencias) {
                System.out.println(s);
            }

            if (dataset < M - 1) {
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
