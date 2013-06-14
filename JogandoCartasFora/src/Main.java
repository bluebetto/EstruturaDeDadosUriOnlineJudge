import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int quantidade;
        
        try {

            quantidade = Integer.parseInt(in.readLine());
            
            while(quantidade != 0){
            	
            	
            	List<Integer> cartas = new ArrayList<Integer>();
            	List<Integer> descartadas = new ArrayList<Integer>();
            	
            	for(int i=0;i<quantidade;i++) cartas.add(i+1);
            	
            	
            	while(quantidade > 1){
            		descartadas.add(cartas.remove(0));
            		cartas.add(--quantidade-1,cartas.remove(0));
            	}
            	
            	System.out.println("Discarded cards: "+descartadas.toString().replace("[", "").replace("]", ""));
            	System.out.println("Remaining card: "+cartas.toString().replace("[", "").replace("]", ""));
            	
            	quantidade = Integer.parseInt(in.readLine());
            }
            
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
        

	}

}
