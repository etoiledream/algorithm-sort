package sort;


public class QuickSort {
	public int[] quickSort(int[] array) {
		partition(array, 0, array.length-1);
		return array;
	}
	public void partition(int[] arr, int lo, int hi) {
		if(lo >= hi)
			return;
		
		int pivot = arr[lo];
		int lowPoint = lo;
		
		for(int i = lo+1; i <= hi; i++) {
			if(arr[i] < pivot) {
				lowPoint++;
				swap(arr, lowPoint, i);
			}
		}
		swap(arr, lo, lowPoint);
		partition(arr, lo, lowPoint-1);
		partition(arr, lowPoint+1, hi);
	}
	
	public void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;  
	}
}
