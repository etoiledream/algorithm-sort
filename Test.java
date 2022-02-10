package algo.sort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArr = {6, 3, 8, 2, 9, 1};
		int[] res = BubbleSort.bubbleSort(testArr);
		for(int i: res) {
			System.out.println(i);
		}
	}

}
