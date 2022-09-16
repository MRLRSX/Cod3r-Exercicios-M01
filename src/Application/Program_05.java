package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class Program_05 {
	public static void main(String[] args) {
		
	       /**
	        *  FIXME INTERFACE -> MAP -> HASHMAP -> MAP
	        *  FIXME METHOD SIZE() ISEMPTY() PUT() REMOVE() CLEAR() VALUES() ENTRYSET() CONTAINSKEY() CONTAINSVALUES()
	        *  @author LUCAS_ROCHA
	        **/
	       Map<String, Integer> candidates = new HashMap<>();
	       try(BufferedReader bufferReader = new BufferedReader(new FileReader("C:\\Users\\lucas\\OneDrive\\Documentos\\vota.txt"))){
		    	 String lines = bufferReader.readLine();
		    	 
		    	 while(lines != null) {
		    		 String[] line = lines.split(",");
		    		 if(candidates.containsKey(line[0])) {
		    			 int accumulator = candidates.get(line[0]);
		    			 candidates.put(line[0],accumulator + Integer.parseInt(line[1]));
		    			 
		    		 }else {
		    			 candidates.put(line[0], Integer.parseInt(line[1]));		    			 
		    		 }
		    		 lines = bufferReader.readLine();
		    	 }
		     }catch(IOException errorCapturado){
		    	 errorCapturado.printStackTrace();
		     }
	         
		     for(String key : candidates.keySet()) {
		    	 System.out.printf("%s , %d\n", key, candidates.get(key));
		     }
		}
}
