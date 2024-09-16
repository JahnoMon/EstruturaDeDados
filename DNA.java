import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int j = scanner.nextInt();
		int k = scanner.nextInt();

        String[][] sequencias = new String[k][j]; // array: 6 elem de tamanho 10 
        
        for(int i = 0; i < k; i++){
            String linha = scanner.nextLine();
            sequencias[i] =linha.split("");
        }
        
        for (int i = 0; i < k; i++) {
            for (int l = 0; l < j; l++) {
                System.out.print(sequencias[i][l] + " ");
            }
            System.out.println();  // Quebra de linha após cada linha do array
        }
		
	}
}
