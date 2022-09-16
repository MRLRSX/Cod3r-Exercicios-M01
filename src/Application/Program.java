package Application;

import java.util.Arrays;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		double[] notasAlunoA = new double[4];
		
		notasAlunoA[0] = 7.0;
		notasAlunoA[1] = 8.5;
		notasAlunoA[2] = 9.0;
		notasAlunoA[3] = 8.0;
		
		System.out.printf("Notas %s", Arrays.toString(notasAlunoA));
		
		double totalA = 0;
		double totalB = 0;
		
		for(double interador : notasAlunoA) {
			totalA += interador;
		}
		
		System.out.printf("\nNota 1: %.2f \nNota 2: %.2f \nNota 3: %.2f \nNota 4: %.2f \nMédia: %.2f", 
				notasAlunoA[0], notasAlunoA[1], notasAlunoA[2], notasAlunoA[3], totalA / notasAlunoA.length );
		
		double[] notasAlunoB = {10.0 , 9.5, 9,5, 8.9};
		
		System.out.printf("\n======= ======= ======= ======= ======= ======== ");
		
		for(double interador : notasAlunoB) {
			totalB += interador;
		}
		
		System.out.printf("\nNota 1: %.2f \nNota 2: %.2f \nNota 3: %.2f \nNota 4: %.2f \nMédia: %.2f", 
				notasAlunoB[0], notasAlunoB[1], notasAlunoB[2], notasAlunoB[3], totalB / notasAlunoB.length );
		
		
	}
}
