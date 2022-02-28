package sort;

public class MergeSort2 {
	public void split(int[] nums, int left, int right) {
		int mid = (left + right) >> 1;
		if(left < right) {
			split(nums, left, mid);
			split(nums, mid+1, right);
			merge(nums, left, mid, right);
		}
	}
	public void merge(int[] nums, int left, int mid, int right) {
		int[] tmp = new int[nums.length];
		System.arraycopy(nums, left, tmp, left, right-left+1);
		
		int i = left, j = mid+1;
		for(int k = left; k <= right; k++) {
			if(i == mid+1) {
				nums[k] = tmp[j++];
			} else if(j == right + 1) {
				nums[k] = tmp[i++];
			} else if(tmp[i] <= tmp[j]) {
				nums[k] = tmp[i++];
			} else {
				nums[k] = tmp[j++];
			}
		}
	}
}
