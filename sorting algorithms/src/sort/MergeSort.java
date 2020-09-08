package sort;

import java.util.Random;
//==============================================================
//Program 2 – Sorting Program
//==============================================================
//<Brandon Tennyson>
//<COSC 336>
//<4/5/2018>
//--------------------------------------------------------------

class MergeSort {
	void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
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

		MergeSort ob = new MergeSort();
		int arrSize = 1000000;
		int[] arr = null;
		arr = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arr[i] = ob.getRand();
		}
		ob.sort(arr, 0, arr.length - 1);

		// System.out.println("merge Sorted array");
		// printArray(arr);
		stopTime = System.currentTimeMillis();
		System.out.println("Elapsed time = " + (stopTime - startTime)
				+ " msecs.");

	}
}