public class Demo{
	public static void main(String[] args){
		int x = 0x7fffffff;
		System.out.println(x);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(0x80000000);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(0x7fffffff + 0x7fffffff);
	}
}