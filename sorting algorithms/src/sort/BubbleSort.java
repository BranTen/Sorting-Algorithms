package sort;

//==============================================================
//Program 2 – Sorting Program
//==============================================================
//<Brandon Tennyson>
//<COSC 336>
//<4/5/2018>
//--------------------------------------------------------------

import java.util.Random;

public class BubbleSort {
	public void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
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

	// Driver method to test above
	public static void main(String args[]) {
		long startTime;
		long stopTime;
		startTime = System.currentTimeMillis();

		BubbleSort ob = new BubbleSort();

		int arrSize = 1000000;
		int[] arr = null;
		arr = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arr[i] = ob.getRand();
		}
		ob.bubbleSort(arr);
		// System.out.println("bubble Sorted array");
		// ob.printArray(arr);
		stopTime = System.currentTimeMillis();
		System.out.println("Elapsed time = " + (stopTime - startTime)
				+ " msecs.");

	}
}
