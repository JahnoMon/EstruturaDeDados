public class Quicksort{
    
    public static void Quicksort(int[] array){
        
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
		
		for(int i = 0; i < inputArray.length; i++){
		    array[i] = Integer.parseInt(inputArray[i]);
		}
		
		Quicksort(array);
	}
}
