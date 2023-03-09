package view;
import java.util.Random;
import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		
		int n1=1;
		int n2=2;
		int[] v = new int[1000];
		
		Random aleatorio = new Random();
		
		for (int i = 0; i < 1000; i++) {
			v[i] = aleatorio.nextInt(101);
		}
		
		Thread tVetImpar = new ThreadVetor(n1, v);
		tVetImpar.start();
		
		Thread tVetPar = new ThreadVetor(n2,v);
		tVetPar.start();
	}

}
