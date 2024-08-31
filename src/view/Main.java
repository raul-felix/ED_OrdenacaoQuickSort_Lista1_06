package view;

import br.edu.fateczl.bubblesort.BubbleSort;
import br.edu.fateczl.mergesort.MergeSort;
import br.edu.fateczl.quicksort.QuickSort;

public class Main {
	
	public static void main(String[] args) {
		
		BubbleSort bubbleSort = new BubbleSort();
		MergeSort mergeSort = new MergeSort();
		QuickSort quickSort = new QuickSort();
		
		int[] vet = new int[1500];
		int tamanho = vet.length;
		
		for (int i = 0; i < tamanho; i++) {
			vet[i] = tamanho - 1 - i;
		}
		
		double tempoInicial = System.nanoTime() / Math.pow(10, 9);
		int[] vetOrd = bubbleSort.sort(vet);
		double tempoFinal = System.nanoTime() / Math.pow(10, 9);
		double tempoBubbleSort = tempoFinal - tempoInicial;
		System.out.println("Ordenando por Bubble Sort\nTempo: " + Double.toString(tempoBubbleSort) + " s\n");
		
		tempoInicial = System.nanoTime() / Math.pow(10, 9);
		vetOrd = mergeSort.sort(vet, 0 , vet.length - 1);
		tempoFinal = System.nanoTime() / Math.pow(10, 9);
		double tempoMergeSort = tempoFinal - tempoInicial;
		System.out.println("Ordenando por Merge Sort\nTempo: " + Double.toString(tempoMergeSort) + " s\n");
		
		tempoInicial = System.nanoTime() / Math.pow(10, 9);
		vetOrd = quickSort.sort(vet, 0 , vet.length - 1);
		tempoFinal = System.nanoTime() / Math.pow(10, 9);
		double tempoQuickSort = tempoFinal - tempoInicial;
		System.out.println("Ordenando por Quick Sort\nTempo: " + Double.toString(tempoQuickSort) + " s\n");
	}
}
