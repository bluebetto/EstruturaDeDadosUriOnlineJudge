import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Item {
	public String nome;
	public float preco;
	
	public Item(String nome, String preco){
		this.nome = nome;
		this.preco = Float.parseFloat(preco);
	}
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        try{

            int quantidade = Integer.parseInt(in.readLine());
            
            for(int i=0; i < quantidade; i++){
               int produtos = Integer.parseInt(in.readLine());
               Item[] precos = new Item[produtos];
               for(int j=0; j<produtos;j++){
            	   String[] partes = in.readLine().split(" ");
            	   precos[j] = new Item(partes[0],partes[1]);
               }
               
               int pedidos = Integer.parseInt(in.readLine());
               float total = 0;
               for(int k=0;k<pedidos;k++){
            	   String partes[] = in.readLine().split(" ");
            	   for(int m=0;m<produtos;m++){
            		   if(precos[m].nome.equals(partes[0])){
            			   total += precos[m].preco * Integer.parseInt(partes[1]);
            			   break;
            		   }
            	   }
               }
               
               System.out.println("R$ "+String.format("%.2f",total).replace(',','.'));
            	
            }
        }catch(IOException e){
        	System.out.println("Erro: "+e.getMessage());
        }


	}

}
