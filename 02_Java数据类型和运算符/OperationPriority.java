public class OperationPriority{
	/*
		基本数据类型转换都是通过字节码的i2b之类的语句完成的。
		强制转换方式就是转换一种数据的解释方式，数据在计算机中运算都是一样的，0 和 1的基本运算，
		出来的值为多少，就看你如何解析了。
	*/
	public static void main(String[] args){
		/*
		int i = 10;
		byte b1 = 9;
		byte b = (byte)i;
		String s = "hello";
		Object o = (Object)s;
		*/
		//210
		//1101 0010
		//1010 1101
		//1010 1110  2 + 4 + 8 + 32
		int i = 0;
		do {
			i ++;
		}while(i < 30);
	}
}