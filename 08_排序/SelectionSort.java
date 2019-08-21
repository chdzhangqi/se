import java.util.Arrays;
public class SelectionSort{
	public static void main(String[] args){
		int[] nums = {1, 43, 22, 13, 413, 4};
		selectionSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void selectionSort1(int[] arrs){
		for (int i = 0; i < arrs.length - 1; i ++){
			int index = i;
			for (int j = i + 1; j < arrs.length; j ++){
				if (arrs[index] > arrs[j]){
					index = j;
				}
			}
			swap(arrs, index, i);
		}
	}
	
	public static void selectionSort(int[] arrs){
		int left = 0;
		int right = arrs.length - 1;
		while(left < right){
			int min = left;
			int max = right;
			if (arrs[min] > arrs[max]){
				swap(arrs, min, max);
			}
			for(int i = left + 1; i < right; i ++){
				if (arrs[i] < arrs[min]){
					min = i;
				}else if (arrs[i] > arrs[max]){
					max = i;
				}
			}
			swap(arrs, left, min);
			swap(arrs, right, max);
			left ++;
			right --;
		}
		
	}
	
	public static void swap(int[] arrs, int i, int j){
		int temp = arrs[i];
		arrs[i] = arrs[j];
		arrs[j] = temp;
	}
	
}