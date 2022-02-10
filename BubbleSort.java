package algo.sort;

// 冒泡排序
public class BubbleSort {
	public static int[] bubbleSort(int[] array) {
		int len = array.length;
		
		if(len == 0) 
			return array;
		
		for(int i = 0; i < len; i++) {
			// i 表示轮数，需要len轮才能把所有元素放到正确的位置上
			for(int j = 0; j < len - i - 1; j++) {
				// len-i-1是因为，后面有i个位置已经是正确的顺序了，-1是因为需要访问j+1的位置，放置越界
				if(array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		return array;
	}
}
