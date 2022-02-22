package algo.sort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort quickSort = new QuickSort();
		int[] testArr = {0, 6, 3, 8, 2, 0, 9, 1};
		int[] res = quickSort.quickSort(testArr);
		for(int i: res) {
			System.out.println(i);
		}
	}

}
