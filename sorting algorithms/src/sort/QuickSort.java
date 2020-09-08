package sort;

import java.util.Random;
//==============================================================
//Program 2 – Sorting Program
//==============================================================
//<Brandon Tennyson>
//<COSC 336>
//<4/5/2018>
//--------------------------------------------------------------

class QuickSort {
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {

			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	void sort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
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
		int max = (int) Math.pow(10, 3);
		int rand = r.nextInt(max - min) + min;
		return rand;
	}

	public static void main(String args[]) {

		long startTime;
		long stopTime;
		startTime = System.currentTimeMillis();

		QuickSort ob = new QuickSort();
		int arrSize = 1000000;
		int[] arr = null;
		arr = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arr[i] = ob.getRand();
		}
		int n = arr.length;
		ob.sort(arr, 0, n - 1);

		// System.out.println("quick sorted array");
		// printArray(arr);
		stopTime = System.currentTimeMillis();
		System.out.println("Elapsed time = " + (stopTime - startTime)
				+ " msecs.");

	}
}