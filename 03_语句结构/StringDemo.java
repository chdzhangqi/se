public class StringDemo{
	public static void main(String[] args){
		/*
		String a = "hello";
		String b = a + "world";
		String c = "helloworld";
		System.out.println(b == c);
		//FutureTask
		//compareAndSwapObject(����, �����пռ��ƫ��ֵ, ���ڵ�ֵ, Ҫ�滻��ֵ)
		*/
		// 5���� 3ĸ�� 1/3С��
		for(int i = 0; i <= 20; i++){
			for(int j = 0; j <= 100 - i; j+=3){
				if(((100 - j - i) * 3 + i * 5 + j / 3) == 100){
					System.out.println(i +" " +(100 - i - j) + " " + j);
				}
			}
		}
	}
}