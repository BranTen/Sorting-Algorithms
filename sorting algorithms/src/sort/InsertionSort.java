package sort;

import java.util.Random;
//==============================================================
//Program 2 – Sorting Program
//==============================================================
//<Brandon Tennyson>
//<COSC 336>
//<4/5/2018>
//--------------------------------------------------------------

public class InsertionSort {
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public int getRand() {
		Random r = new Random();
		int min = 1;
		int max = (int) Math.pow(10, 12);
		int rand = r.nextInt(max - min) + min;
		return rand;
	}

	public static void main(String args[]) {
		long startTime;
		long stopTime;
		startTime = System.currentTimeMillis();

		InsertionSort ob = new InsertionSort();
		int arrSize = 1000000;
		int[] arr = null;
		arr = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arr[i] = ob.getRand();
		}
		ob.sort(arr);
		// System.out.println("insertion Sorted array");
		// printArray(arr);
		stopTime = System.currentTimeMillis();
		System.out.println("Elapsed time = " + (stopTime - startTime)
				+ " msecs.");

	}
}

