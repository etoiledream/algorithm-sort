package sort;

public class MergeSort {
	public void mergeSort(int[] arr, int left, int right) {
		int mid = (left + right) / 2;
		if(left < right) {
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			mergeTwoArr(arr, left, mid, right);
		}
	}
	public void mergeTwoArr(int[] arr, int left, int mid, int right) {
		int[] tmp = new int[right - left + 1];
		
		int i = left;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= right) {
			if(arr[i] <= arr[j]) {
				tmp[k++] = arr[i++];
			} else {
				tmp[k++] = arr[j++];
			}
		}
		while(i <= mid) {
			tmp[k++] = arr[i++];
		}
		while(j <= right) {
			tmp[k++] = arr[j++];
		}
		
		for(int index = 0; index < tmp.length; index++) {
			arr[index+left] = tmp[index];
		}
	}
}
