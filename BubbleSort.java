package algo.sort;

// ð������
public class BubbleSort {
	public static int[] bubbleSort(int[] array) {
		int len = array.length;
		
		if(len == 0) 
			return array;
		
		for(int i = 0; i < len; i++) {
			// i ��ʾ��������Ҫlen�ֲ��ܰ�����Ԫ�طŵ���ȷ��λ����
			for(int j = 0; j < len - i - 1; j++) {
				// len-i-1����Ϊ��������i��λ���Ѿ�����ȷ��˳���ˣ�-1����Ϊ��Ҫ����j+1��λ�ã�����Խ��
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
