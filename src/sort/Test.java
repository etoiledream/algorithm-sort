package sort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort2 ms = new MergeSort2();
		int[] testArr = {0, 6, 3, 8, 2, 0, 9, 1};
//		int[] res = ms.mergeSort(testArr, 0, testArr.length-1);
		ms.split(testArr, 0, testArr.length-1);
		for(int i: testArr) {
			System.out.println(i);
		}
	}

}
