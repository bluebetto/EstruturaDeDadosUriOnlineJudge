import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TDARacional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		int quantidade;
		String expressao;
		
		try{
			quantidade = Integer.parseInt(in.readLine());
			for(int i=0; i< quantidade;i++){
				expressao = in.readLine();
				String partes[] = expressao.split(" ");
				
			}
			
			
		}catch(IOException e){
			System.out.println("Erro ao ler arquivo");
		}
		
		
		
		
	}

}
