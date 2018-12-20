import java.util.Scanner;
import java.util.Stack;
public class TorresDeHanoi {
    public static void main(String[] args) {
    	Stack<Integer> origem = new Stack<Integer>();
    	Stack<Integer> aux = new Stack<Integer>();
    	Stack<Integer> destino = new Stack<Integer>();
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	for(int i = n; i >= 1; i--) {
    		origem.push(i);	
    	}
    	torreDeHanoi(n, origem, aux, destino);	
    }
    public static void torreDeHanoi(int n, Stack<Integer> origem, Stack<Integer> aux, Stack<Integer> destino) {
    	if(n > 0) {
    		torreDeHanoi(n-1, origem, destino, aux);
    		destino.push(origem.pop());
    		System.out.println("Original " + origem);
    		System.out.print("Auxiliar" + aux);
    		System.out.print("Destino" + destino);
    		torreDeHanoi(n-1, aux, destino, origem);
    	} 
	}

}