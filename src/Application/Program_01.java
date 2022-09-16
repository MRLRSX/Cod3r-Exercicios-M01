package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import model.Candidato;

/*@author Lucas_Rocha**/

public class Program_01 {
	
	public static void main(String[] args) {
        
		/**
         * API COLLECTIONS
         * CONJUNTO -> SET INTERFACE 
         * CONJUNTO -> HASHSET MÉTODOS ++ SIZE() CONTAINS() REMOVE() ADD() ADDALL() RETAINALL()
         * HETEROGÊNO HOMOGÊNEO -> NÃO ACEITA OBJETOS DUPLICADOS PODE SER ORGENADO NÃO INDEXADO
         * EXEMPLO INSTANCIA HETEROGÊNA HASHSET NAME = NEW HASHSET();
         * EXEMPLO INSTANCIA HOMOGÊNA HASHSET<TIPO> NAME = NEW HASHSET <TIPO>(); NÃO ORDENADO
         * EXEMPLO INSTANCIA HOMOGÊNA SET<TIPO> NAME = NEW HASHSET <TIPO>(); NÃO ORDENADO
         * EXEMPLO INSTANCIA HOMOGÊNA SET<TIPO> NAME = NEW TREESET <TIPO>();  ORDENADO 
         * EXEMPLO INSTANCIA HOMOGÊNA SET<TIPO> NAME = NEW SORTEDSET <TIPO>(); ORDENADO
         * */
		
	     Set<Candidato> candidatos = new HashSet<>();
	     
	     try(BufferedReader bufferReader = new BufferedReader(new FileReader("C:\\Users\\lucas\\OneDrive\\Documentos\\vota.txt"))){
	    	 String lines = bufferReader.readLine();
	    	 
	    	 while(lines != null) {
	    		 String[] linha = lines.split(",");
	    		 candidatos.add(new Candidato(linha[0], Integer.parseInt(linha[1])));
	    		 lines = bufferReader.readLine();
	    	 }
	     }catch(IOException errorCapturado){
	    	 errorCapturado.printStackTrace();
	     }
	     candidatos.stream().forEach(System.out::println);
	     
		
	}
}
