import java.io.* 
import java.util.*;

public class Main{
    
    public object[] pilha;
    public int posicaoPilha;
    
    public static void Pilha(){
        this.posicaoPilha = -1;
        this.pilha = new Object[100];
    }
    
    public static boolean pilhaVazia(){
        if (this. posicaoPilha == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static int tamanho(){
        if(this.pilhaVazia){
            return 0;
        } else {
            return this.posicaoPilha + 1;
        }
    }
    
    public static void PUSH(){
        if(this.posicaoPilha < this.pilha.length - 1){
            this.pilha[++posicaoPilha] = valor;
        }
    }
    
    public Object POP(){
        if(pilhaVazia()){
            return null;
        } else {
            return this.pilha[this.posicaoPilha --];
        }
    }
    
	public static void main(String[] args) {
	    
	    Pilha p = new Pilha();
	    Scanner sc = new Scanner(System.in);
	    int pops = 0;
	    
	    do{
	        String input = sc.nextLine();
	        switch{
	            case (input == "POP"):
	                System.out.println();
	                pops++;
	            case (input == "PUSH"):
	                int[] numeros = sc.nextLine();
	                for(int n : numeros){
	                    
	                }
	                
	        }
	    }while(pop < 3);
		
	}
}
