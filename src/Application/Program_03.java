package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import model.Candidato;

public class Program_03 {
	public static void main(String[] args) {
		
	   /**
	    * QUEUE -> FILA MÉTODOS PEEK() ELEMENT() OFFER() ADD() SIZE() CLEAR() POOL() ISEMPTY() REMOVE() CONTAINS()
	    * INSTANCIA -> QUEUE <TIPO> NAME = NEW <TIPO> LINKEDLIST<>();
	    * FIFO -> FIRST IN FIRST OUT
	    * */
       Queue<Candidato> candidatos = new LinkedList<>();
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
