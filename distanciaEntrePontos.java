import java.util.*;

public class distanciaEntrePontos{
    public static void distanciaEuclidiana(){
        
        Scanner scanner = new Scanner(System.in);
        String linhas = scanner.nextLine();
        String[] arrayLinhas = linhas.split(" ");
	    	int[] n = new int[arrayLinhas.length];
		    n[0] = Integer.parseInt(arrayLinhas[0]);
		
        for(int i = 0; i < n[0]; ++i){
            
            String pontos = scanner.nextLine();
            String[] arrayPontos = pontos.split(" ");
            int[] array = new int[arrayPontos.length];
            
            for(int j = 0; j < arrayPontos.length; j++){
                array[j] = Integer.parseInt(arrayPontos[j]);
            }
            
            int Xa = array[0], Ya = array[1], Xb = array[2], Yb = array[3]; 
            double distancia = Math.sqrt(Math.pow(Xb - Xa, 2) + Math.pow(Yb - Ya, 2));
	        System.out.printf("%.2f%n",distancia);
        }
    }
    
	public static void main(String[] args) {
		distanciaEuclidiana();
	}
}
