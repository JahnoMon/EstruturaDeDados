import java.util.*;

public class listaDoNoel {

    public static void ordenar(int n, Scanner scanner) { 
        List<String> pessoas = new ArrayList<>();
        List<String> comportados = new ArrayList<>();
        List<String> naoComportados = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (scanner.hasNextLine()) { 
                String pessoa = scanner.nextLine();

                if (pessoa.startsWith("+ ")) {
                    comportados.add(pessoa.substring(2)); 
                } else if (pessoa.startsWith("- ")) {
                    naoComportados.add(pessoa.substring(2)); 
                }
                pessoas.add(pessoa.substring(2));
            }
        }

        Collections.sort(pessoas);

        for (String p : pessoas) {
            System.out.println(p);
        }

        System.out.printf("Se comportaram: %d | Nao se comportaram: %d%n", comportados.size(), naoComportados.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = Integer.parseInt(scanner.nextLine());

        ordenar(linhas, scanner);

        scanner.close();
    }
}
