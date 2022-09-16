package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Candidato;

public class Program_02 {
	public static void main(String[] args) {

		/**
		 * API COLLECTIONS LIST INTERFACE -> LISTA DE ELEMENTOS MÉTODOS - SIZE() ADD() REMOVE()
		 * CONTAINS() LIST -> HETEROGÊNA E HOMOGÊNA ORDENADA E INDEXADO
		 */
		
		List<Candidato> candidatos = new ArrayList<>();
	     
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
