import java.util.Scanner;
import java.util.Stack;
public class TorresDeHanoi {
    public static void main(String[] args) {
    	Stack<Integer> torre1 = new Stack<Integer>();
    	Stack<Integer> torre2 = new Stack<Integer>();
    	Stack<Integer> torre3 = new Stack<Integer>();

    	for(int i = 3; i >= 1; i--) {
    		torre1.push(i);
    	}
    	ordena(torre1.size(), torre1, torre3, torre2);	
    }
    public static void ordena(int n, Stack<Integer> torre1, Stack<Integer> torre3, Stack<Integer> torre2 ) {
    	if(n > 0) {
    		ordena(n-1, torre1, torre2, torre3);
    		torre3.push(torre1.pop());
    		System.out.println("Torre1: " + torre1 + " Torre 2: " + torre2 + " Torre3: " + torre3);
    		ordena(n-1, torre2, torre3, torre1);
    	}
    	
    	
    }
    
    
}

