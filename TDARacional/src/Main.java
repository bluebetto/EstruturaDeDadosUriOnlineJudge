import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
		int quantidade;
		int numerador1, numerador2, denominador1, denominador2, numerador_resposta, denominador_resposta, menor, divisor;
		char operacao;
		Integer[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547,557, 563, 569, 571 ,577 ,587, 593, 599, 601, 607, 613, 617, 619, 631, 641,643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
		String[] partes;
		String expressao;
		
		try{
			quantidade = Integer.parseInt(in.readLine());
			
			for(int i = 0; i < quantidade; i++){
				
				expressao = in.readLine();
				partes = expressao.split(" ");
				
				numerador1 = Integer.parseInt(partes[0]);
				denominador1 = Integer.parseInt(partes[2]);
				operacao = partes[3].charAt(0);
				numerador2 = Integer.parseInt(partes[4]);
				denominador2 = Integer.parseInt(partes[6]);
				
				
				switch(operacao){
					case '+':
						numerador1 = numerador1 * denominador2;
						numerador2 = numerador2 * denominador1;
						numerador_resposta = numerador1+numerador2;
						denominador_resposta = denominador1 * denominador2;
					break;
					case '-':
						numerador1 = numerador1 * denominador2;
						numerador2 = numerador2 * denominador1;
						numerador_resposta = numerador1 - numerador2;
						denominador_resposta = denominador1 * denominador2;
					break;
					case '*':
						numerador_resposta = numerador1 * numerador2;
						denominador_resposta = denominador1 * denominador2;
					break;
					case '/':
						numerador_resposta = numerador1 * denominador2;
						denominador_resposta = denominador1 *  numerador2;
					break;
					default:
						numerador_resposta = 0;
						denominador_resposta = 0;
					break;
				}
				
				System.out.print(String.valueOf(numerador_resposta+"/"+denominador_resposta));
				System.out.print(" = ");
				
				menor = Math.min(Math.abs(numerador_resposta),Math.abs(denominador_resposta));
				int numerador_simplificado = numerador_resposta, denominador_simplicado = denominador_resposta;
				for(int j = 2; j <= menor; j++){
					divisor = j;
		            if(numerador_resposta % divisor == 0 && denominador_resposta % divisor == 0){
		            	numerador_simplificado   = numerador_resposta / divisor;
		            	denominador_simplicado = denominador_resposta / divisor;
		            }
		            
		            //menor = Math.min(Math.abs(numerador_simplificado),Math.abs(denominador_resposta));
		            
				}
				System.out.println(String.valueOf(numerador_simplificado+"/"+denominador_simplicado));
			}
		}catch(Exception e){
			//System.out.println("Erro: "+e.getMessage());
		}
	}
	
}
