import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String linha = "";
        try{
        	do{
            	linha = in.readLine();
            	if(linha != null) System.out.println(verificar(linha));
            }while(linha != null);
        }catch(IOException e){
        	System.out.println("Erro> "+e.getMessage());
        }

	}
	
	public static String verificar(String linha){
		Stack<Character> parenteses = new Stack<Character>();
		
		for(int i = 0; i < linha.length();i++){
			if(linha.charAt(i) == '(') parenteses.push(new Character('('));
			if(linha.charAt(i) == ')'){
				if(!parenteses.isEmpty()){
					 parenteses.pop();
				}else{
					return "incorrect";
				}
			}
		}
		if(parenteses.isEmpty()) return "correct";
		
		return "incorrect";
		
	}

}
