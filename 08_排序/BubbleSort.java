import java.util.Arrays;
public class BubbleSort{
	public static void main(String[] args){
		int[] nums = {1, 43, 22, 13, 413, 4};
		bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void bubbleSort(int[] arrs){
		
		int index = arrs.length - 1;
		int flag;
		do{
			flag = -1;
			for (int i = 0; i < index; i++){
				if (arrs[i] > arrs[i + 1]){
					swap(arrs, i, i + 1);
					flag = i;
				}
			}
			index = flag;
		}while(flag != -1);
	}
	
	public static void bubbleSort1(int[] arrs){
		
		for (int i = 0; i < arrs.length - 1; i++){
			for (int j = 0; j < arrs.length - i - 1; j++){
				if(arrs[j] > arrs[j + 1]){
					swap(arrs, j, j + 1);
				}
			}
		}
		
	}
	
	public static void swap(int[] arrs, int i, int j){
		int temp = arrs[i];
		arrs[i] = arrs[j];
		arrs[j] = temp;
	}
	
}