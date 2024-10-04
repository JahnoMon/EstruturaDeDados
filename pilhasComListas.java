import java.io.*;
import java.util.*;

public class HuxleyCode {

    public static class PilhaDeListas {
        public Stack<List<Integer>> pilha;

        public PilhaDeListas() {
            this.pilha = new Stack<>();
        }

        // Método PUSH: adiciona uma lista de inteiros à pilha
        public void PUSH(List<Integer> lista) {
            pilha.push(lista);
        }

        // Método POP: remove e imprime a lista do topo da pilha no formato esperado
        public void POP() {
            if (pilha.isEmpty()) {
                System.out.println("EMPTY STACK");
            } else {
                List<Integer> topo = pilha.pop();
                for (int i = 0; i < topo.size(); i++) {
                    if (i == topo.size() - 1) {
                        System.out.print(topo.get(i)); // Último valor sem espaço
                    } else {
                        System.out.print(topo.get(i) + " ");
                    }
                }
                System.out.println(); // Nova linha após a impressão
            }
        }
    }

    public static void main(String[] args) {
        PilhaDeListas pilha = new PilhaDeListas();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String comando = sc.nextLine();

            if (comando.equals("PUSH")) {
                String linhaDeNumeros = sc.nextLine();
                String[] numeros = linhaDeNumeros.split(" ");

                // Converter os números para uma lista de inteiros
                List<Integer> lista = new ArrayList<>();
                for (String numero : numeros) {
                    lista.add(Integer.parseInt(numero));
                }

                // Realizar o PUSH
                pilha.PUSH(lista);
            } else if (comando.equals("POP")) {
                // Realizar o POP
                pilha.POP();
            }
        }

        sc.close();
    }
}
