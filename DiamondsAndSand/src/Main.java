import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        try{
        	int quantidade = Integer.parseInt(in.readLine());
        	for(int i=0;i<quantidade;i++){
        		String linha = in.readLine();
        		int abertos = 0;
        		int achados = 0;
        		for(int j=0;j<linha.length();j++){
        			if(linha.charAt(j) == '<') abertos++;
        			if(linha.charAt(j) == '>' && abertos > 0){
        				abertos--;
        				achados++;
        			}
        		}
        		System.out.println(achados);
        	}
        	
        }catch(IOException e){
        	System.out.println("Erro: "+e.getMessage());
        }
	}
}
