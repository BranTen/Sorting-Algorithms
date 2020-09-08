package sort;

import java.util.Random;
//==============================================================
//Program 2 – Sorting Program
//==============================================================
//<Brandon Tennyson>
//<COSC 336>
//<4/5/2018>
//--------------------------------------------------------------

class SelectionSort {
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int arr[]) {
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

		SelectionSort ob = new SelectionSort();
		int arrSize = 1000000;
		int[] arr = null;
		arr = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arr[i] = ob.getRand();
		}
		ob.sort(arr);
		// System.out.println("selection Sorted array");
		// ob.printArray(arr);
		stopTime = System.currentTimeMillis();
		System.out.println("Elapsed time = " + (stopTime - startTime)
				+ " msecs.");

	}
}
