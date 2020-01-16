package assignments;

// Assignment 14: Write a Program to Sort an array Element using bubble Sort

class BubbleSort {
	void bubbleSort(int arr[]) {
		int n = arr.length;
		int j;
		for(int i =0;i<n-1;i++)
			for(j = 0;j < n - i - 1; j++) 
				if (arr[j]>arr[j + 1]) {
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

	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 50, 20, 6, 103, 67, 2, 9};
		ob.bubbleSort(arr);
		System.out.println("Sorted array is :");
		ob.printArray(arr);
	}
}