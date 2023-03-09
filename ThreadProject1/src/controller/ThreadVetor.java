package controller;

public class ThreadVetor extends Thread {

	private int num;
	private int[] vet = new int[1000];
	
	public ThreadVetor(int num, int[] vet) {
		this.num = num;
		this.vet = vet;
	}

	@Override
	public void run() {
		if (num % 2 == 0) {
			double tIn = System.nanoTime();
			for (int i = 0; i <1000; i++) {
				vet[i] = vet[i];
			}
			double tFim = System.nanoTime();
			double tempoT = tFim - tIn;
			tempoT = tempoT / Math.pow(10, 9);
			System.out.println("Tempo com For = " +tempoT);
		} else {
			if (num % 2 != 0) {
				double tIn = System.nanoTime();
				for (int nVet : vet) {
					vet[nVet] = vet[nVet];
				}
				double tFim = System.nanoTime();
				double tempoT = tFim - tIn;
				tempoT = tempoT / Math.pow(10, 9);
				System.out.println("Tempo com For Each = " +tempoT);
			}
		}
		
	}
	
	
	
}
