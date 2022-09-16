package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

import model.Candidato;

public class Program_04 {
	public static void main(String[] args) {
		
		   /**
		    * DEQUE -> PILHA MÉTODOS PEEK() PUSH() ELEMENT() OFFER() ADD() SIZE() CLEAR() POOL() ISEMPTY() REMOVE() CONTAINS()
		    * INSTANCIA -> DEQUE <TIPO> NAME = NEW <TIPO> ARRAYDEQUE<>();
		    * LIFO -> LAST IN FIRST OUT
		    * */
	       Deque<Candidato> candidatos = new ArrayDeque<>();
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
